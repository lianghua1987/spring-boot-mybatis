package com.hua.springboot.service;

import com.hua.springboot.dao.UserDao;
import com.hua.springboot.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService{


    @Autowired
    private UserDao userDao;


    @Override
    public List<User> getUsers(int age){

        return userDao.getUsers(age);
    }

}
