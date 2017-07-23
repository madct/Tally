package com.tally.dao;

import com.tally.domain.User;

public interface UserDao {
	public User selectUserById(Integer userId);
}	
