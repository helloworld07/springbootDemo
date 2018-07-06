package com.zcy.springbootDemo.controller;

import com.zcy.springbootDemo.domain.User;
import com.zcy.springbootDemo.service.impl.ESUserServiceImpl;
import com.zcy.springbootDemo.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

/**
 * Created by 491445 on 2018/7/6.
 */
@Controller
@RequestMapping("/es")
public class ELSearchTestController {
    @Autowired
    ESUserServiceImpl esUserService;

    @RequestMapping("/list")
    public Iterable<User> list() {
        esUserService.save1(new User("ee","ee123","email@qwe","nicknameok",new Date()));
        return esUserService.findAll();
    }
}
