package com.spinel.hr.base.service;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.spinel.hr.base.domain.User;
import com.spinel.hr.base.repository.AbstractRepo;
import com.spinel.hr.base.repository.UserRepo;
import com.spinel.hr.exception.AuthorizationException;

@Service
public class UserServiceImpl extends AbstractServiceImpl<User> implements UserDetailsService, UserService {
	
	@Autowired
	PasswordEncoder passwordEncoder;
	
	@Autowired
	private UserRepo userRepo;

	@Override
	public AbstractRepo<User> getRepo() {
		return userRepo;
	}
	
	@Override
	public UserDetails loadUserByUsername(String username) throws BadCredentialsException {
	    User user = userRepo.findOneByUsername(username);
	
	    if (user == null) {
	        throw new BadCredentialsException(String.format("No user found with username '%s'.", username));
	    } else {
	        return new org.springframework.security.core.userdetails.User(user.getUsername(),user.getPassword(),new ArrayList<>());
	    }
	}

	@Override
	public User registerUser(User user) {
		User existingUser = userRepo.findOneByUsername(user.getUsername());
		if(existingUser!=null){
			throw new RuntimeException("Username already used");
		}
		if(!StringUtils.hasText(user.getPassword())){
			throw new RuntimeException("Password is empty");
		}
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		userRepo.saveAndFlush(user);
		return user;
	}

	@Override
	public User findByUserName(String userName) {
		return userRepo.findOneByUsername(userName);
	}

	@Override
	public User updateCurrentUser(User user) {
		if(!getCurrentUser().getId().equals(user.getId())){
			throw new AuthorizationException("Unable to update other user details");
		}
		return save(user);
	}

	@Override
	public User getCurrentUser() {
		return userRepo.findOneByUsername(getAuthentication().getName());
	}

}
