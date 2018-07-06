package com.zcy.springbootDemo.controller;

import com.zcy.springbootDemo.domain.User;
import com.zcy.springbootDemo.domain.UserMapper;
import com.zcy.springbootDemo.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by zcy on 2018/7/6.
 */
@RestController
public class CacheTestController {
    @Autowired
    UserServiceImpl userService;

    @Autowired
    UserMapper userMapper;

    @RequestMapping("/NoCache")
    public String CacheTest(){
        /*Pageable pageable = new PageRequest(1,1);
        Page<User> all = userService.findAll(pageable);*/
        List<User> allUser = userMapper.findAllUser();
        return allUser.toString();
    }

    @RequestMapping("/Cache")
    @Cacheable(value = "User")
    public String Cachetest1(){
        return userMapper.findAllUserCache().toString();
    }
}
