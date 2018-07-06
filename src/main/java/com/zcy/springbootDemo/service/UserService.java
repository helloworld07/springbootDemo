package com.zcy.springbootDemo.service;

import com.zcy.springbootDemo.domain.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;

/**
 * Created by 491445 on 2018/7/6.
 */
public interface UserService {
    Page<User> findAll(Pageable pageable);

    void save(User user);

    void delete(Long id);
}
