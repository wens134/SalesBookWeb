package com.spinel.hr.config;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.spinel.hr.base.domain.User;

public class AppUserDetails implements UserDetails {

	private String username;
	private String password;
	Collection<? extends GrantedAuthority> authorities;
	
	public AppUserDetails(User user) {
		username = user.getUsername();
		password =  user.getPassword();
		List<GrantedAuthority> auths = new ArrayList<>();
		
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return authorities;
	}

	@Override
	public String getPassword() {
		return password;
	}

	@Override
	public String getUsername() {
		return username;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

}
