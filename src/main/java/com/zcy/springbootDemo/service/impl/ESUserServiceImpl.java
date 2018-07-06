package com.zcy.springbootDemo.service.impl;

import com.zcy.springbootDemo.domain.User;
import com.zcy.springbootDemo.domain.UserElasticsearchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by 491445 on 2018/7/6.
 */
@Service
public class ESUserServiceImpl {
    /*elasticsearch*/
    @Autowired
    UserElasticsearchRepository userElasticsearchRepository;

    public void save1 (User user) {
        userElasticsearchRepository.save(user);
    }

    public Iterable<User> findAll() {
        return userElasticsearchRepository.findAll();
    }
}
