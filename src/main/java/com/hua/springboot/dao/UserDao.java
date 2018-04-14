package com.hua.springboot.dao;

import com.hua.springboot.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserDao {


    @Select("SELECT ID, USERNAME, AGE, PHONE, EMAIL FROM USER WHERE AGE =#{age}")
    public List<User> getUsers(int age);
}
