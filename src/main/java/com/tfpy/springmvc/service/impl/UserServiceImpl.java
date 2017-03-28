package com.tfpy.springmvc.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.tfpy.springmvc.dao.UserDao;
import com.tfpy.springmvc.model.User;
import com.tfpy.springmvc.service.UserService;

@Service("userService")  
public class UserServiceImpl implements UserService {  
    @Resource  
    private UserDao userDao;  
    public User getUserById(int userId) {  
        return this.userDao.selectByPrimaryKey(userId);  
    }  
}