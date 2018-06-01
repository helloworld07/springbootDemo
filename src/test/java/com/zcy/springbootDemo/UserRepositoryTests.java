package com.zcy.springbootDemo;

import com.zcy.springbootDemo.domain.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.zcy.springbootDemo.domain.User;
import com.zcy.springbootDemo.domain.UserRepository;
import org.junit.Assert;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.DateFormat;
import java.util.Date;

/**
 * Created by 491445 on 2018/6/1.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTests {
    @Autowired
    private UserRepository userRepository;

    //测试数据库dao操作实例
    @Test
    public void test() throws Exception {
        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
        String formattedDate = dateFormat.format(date);
        //	测试新增
        userRepository.save(new User("a","aa1", "aa@126.com", "aa", date));
		userRepository.save(new User("b","bb2", "bb@126.com", "bb", date));
		userRepository.save(new User("c","cc3", "cc@126.com", "cc", date));
        //测试查询
        Assert.assertEquals(3, userRepository.findAll().size());
        Assert.assertEquals("bb", userRepository.findByUserNameOrEmail("b", "bb@126.com").getNickName());
        //测试删除
        userRepository.delete(userRepository.findByUserName("a"));
    }
}
