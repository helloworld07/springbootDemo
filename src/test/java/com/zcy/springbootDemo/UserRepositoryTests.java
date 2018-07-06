package com.zcy.springbootDemo;

import com.zcy.springbootDemo.domain.UserMapper;
import com.zcy.springbootDemo.domain.UserRepository;
import com.zcy.springbootDemo.service.impl.UserServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.zcy.springbootDemo.domain.User;
import com.zcy.springbootDemo.domain.UserRepository;
import org.junit.Assert;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by 491445 on 2018/6/1.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTests {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    UserMapper userMapper;

    //测试数据库dao操作实例
    @Test
    public void test() throws Exception {
        /*Date date = new Date();
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
        userRepository.delete(userRepository.findByUserName("a"));*/
        //测试登录
        User byUserNameAndPassWord = userRepository.findByUserNameAndPassWord("c", "bb2");
        System.out.println(byUserNameAndPassWord);
    }

    @Test
    public void findUserList(){
        List<User> allUser = userMapper.findAllUser();
        System.out.println(allUser);
    }

}
