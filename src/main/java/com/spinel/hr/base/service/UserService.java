package com.spinel.hr.base.service;

import com.spinel.hr.base.domain.User;

public interface UserService extends AbstractService<User> {

	public User registerUser(User user);
	
	public User findByUserName(String userName);
	
	public User updateCurrentUser(User user);
	
	public User getCurrentUser();
}