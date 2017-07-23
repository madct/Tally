package com.tally.service;

import com.tally.domain.User;

public interface UserService {
	User selectUserById(Integer userId);
}
