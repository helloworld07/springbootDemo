package com.zcy.springbootDemo.domain;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * Created by 491445 on 2018/6/1.
 * 自动化装配数据库操作，可以直接查询（JPA）
 */
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUserName(String userName);
    User findByUserNameOrEmail(String username, String email);
    User findByUserNameAndPassWord(String username,String password);

    @Override
    Optional<User> findById(Long aLong);

    
}
