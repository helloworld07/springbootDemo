package com.zcy.springbootDemo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Created by 491445 on 2018/6/1.
 */
@Component
public class Task {
    Logger logger = LoggerFactory.getLogger(Task.class);
    //@Scheduled(cron = "0/2 * * * * ?")
    public void timer(){
        //获取当前时间
        LocalDateTime localDateTime =LocalDateTime.now();
        logger.info("当前时间为:" + localDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
    }
}
