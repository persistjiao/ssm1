package com.persist.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.persist.dao.UserMapper;
import com.persist.model.User;
import com.persist.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService{

	@Resource
	private UserMapper userDao;
	@Override
	public User getUserById(int id) {
		
		return this.userDao.selectByPrimaryKey(id);
	}

}
