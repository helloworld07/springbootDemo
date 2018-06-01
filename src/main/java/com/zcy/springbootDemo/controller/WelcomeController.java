package com.zcy.springbootDemo.controller;

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
    @Autowired
    private JedisPool jedisPool;

    @RequestMapping("/hello")
    public String index() {
        //有猫饼呀~
        /*Jedis jedis = jedisPool.getResource();
        jedis.set("test", "aaabbbjjj");
        System.out.println("**************************进入了测试****************************");*/
        return "well done!";
    }

    @RequestMapping("/getUser")
    public User getUser() {
        User user=new User();
        user.setUserName("小明");
        user.setPassWord("123");
        return user;
    }
}
