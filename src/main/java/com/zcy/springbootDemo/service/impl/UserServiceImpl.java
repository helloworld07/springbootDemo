package com.zcy.springbootDemo.service.impl;

import com.zcy.springbootDemo.domain.User;
import com.zcy.springbootDemo.domain.UserElasticsearchRepository;
import com.zcy.springbootDemo.domain.UserRepository;
import com.zcy.springbootDemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

/**
 * Created by zcy on 2018/7/6.
 */
@Service
@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
@CacheConfig(cacheNames = "user")
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    @Override
    @Cacheable()
    public Page<User> findAll(Pageable pageable) {
        return userRepository.findAll(pageable);
    }

    @Override
    @Transactional
    @CacheEvict(allEntries=true)
    public void save(User user) {
        userRepository.save(user);
    }

    @Override
    @Transactional
    @CacheEvict(allEntries=true)
    public void delete(Long id) {
        Optional<User> user = userRepository.findById(id);
        User user1 = user.get();
        userRepository.delete(user1);
    }

}
