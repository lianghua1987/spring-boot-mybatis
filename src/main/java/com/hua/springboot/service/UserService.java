package com.hua.springboot.service;

import com.hua.springboot.pojo.User;

import java.util.List;

public interface UserService {

    public List<User> getUsers(int age);
}
