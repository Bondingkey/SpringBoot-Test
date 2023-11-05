package com.gzc.controller;

import com.gzc.properties.DataSourceProperties;
import com.gzc.properties.DataSourceProperties2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: 拿破仑
 * @Date&Time: 2023/11/04  16:58  周六
 * @Project: SpringBootTest
 * @Write software: IntelliJ IDEA
 * @Purpose: 在此处编辑
 */
@RestController
@EnableConfigurationProperties(DataSourceProperties2.class)//哪个类要注入批量注入的类就用这个注解,括号里写批量注入的类
public class HelloSpringBootController {

    @Autowired
    private DataSourceProperties dataSourceProperties;

    @Autowired
    private DataSourceProperties2 dataSourceProperties2;

    @RequestMapping("/hello")
    public String hello(){
        System.out.println(dataSourceProperties);
        System.out.println(dataSourceProperties2);
        return "Hello Spring Boot";
    }

}
