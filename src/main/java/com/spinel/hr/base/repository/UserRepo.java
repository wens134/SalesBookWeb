package com.spinel.hr.base.repository;

import java.util.List;

import com.spinel.hr.base.domain.User;

public interface UserRepo extends AbstractRepo<User> {

	public List<User> findAll();
	
	public User findOneByUsername(String userName);
	
}
