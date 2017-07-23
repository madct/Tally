package com.tally.service;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.tally.baseTest.SpringTestCase;
import com.tally.domain.User;

/**
 * ���ܸ�Ҫ��UserService��Ԫ����
 * 
 */
public class UserServiceTest extends SpringTestCase {
	@Autowired
	private UserService userService;
	Logger logger = Logger.getLogger(UserServiceTest.class);

	@Test
	public void selectUserByIdTest() {
		User user = userService.selectUserById(10);
		logger.debug("���ҽ��" + user);
	}

}