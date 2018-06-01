package com.zcy.springbootDemo.domain;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by 491445 on 2018/6/1.
 */
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUserName(String userName);
    User findByUserNameOrEmail(String username, String email);
}
