package com.tally.service;

import com.tally.dao.UserDao;
import com.tally.domain.User;

public class UserServiceImpl implements UserService{
	private UserDao userDao;
	
	@Override
	public User selectUserById(Integer userId) {
		// TODO Auto-generated method stub
		return userDao.selectUserById(userId);
	}
}
