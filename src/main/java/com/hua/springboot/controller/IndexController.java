package com.hua.springboot.controller;

import com.hua.springboot.pojo.User;
import com.hua.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
public class IndexController {


    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> getUsers(int age){
        return userService.getUsers(age);
    }


    @RequestMapping(value = {"/index", "/index2", "/index3"}, method = RequestMethod.GET)
    public Map<String, String> index(){
        Map<String, String> map = new HashMap<>();
        map.put("梁骅","blackrock有offer1,2,3");
        return map;
    }




    @RequestMapping(value = {"/index1"}, method = RequestMethod.GET)
    public Map<String, String> index1(){
        Map<String, String> map = new HashMap<>();
        map.put("梁骅","blackrock有offer1");
        return map;
    }

    @GetMapping("/index4")
    public Map<String, String> index4(){
        Map<String, String> map = new HashMap<>();
        map.put("梁骅","blackrock有offer4");
        return map;
    }


}
