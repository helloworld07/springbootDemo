package com.zcy.springbootDemo.domain;

import com.zcy.springbootDemo.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by zcy on 2018/7/5.
 * 自定义配置mapper映射关系（灵活数据库操作）
 * 如果实体名与表名不同 可以用 as 语句变换一下
 */
@Mapper
@Component
public interface UserMapper {
    @Select("select user_name as userName,pass_word as password from user")
    List<User> findAllUser();

    @Select("select user_name as userName,pass_word as password from user")
    List<User> findAllUserCache();
}
