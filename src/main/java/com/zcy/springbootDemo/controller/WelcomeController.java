package com.zcy.springbootDemo.controller;

import com.zcy.springbootDemo.Exception.ServiceException;
import com.zcy.springbootDemo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

/**
 * Created by 491445 on 2018/6/1.
 */
@RestController
public class WelcomeController {
    @RequestMapping("/test")
    public String index() {
        return "this is a Test Web Page!!!";
    }

    @RequestMapping("/getUser")
    public User getUser() {
        User user=new User();
        user.setUserName("小明");
        user.setPassWord("123");
        return user;
    }

    @RequestMapping("testAdvice")
    public String testAdvice(String a){
        throw new ServiceException("test");
    }
}
