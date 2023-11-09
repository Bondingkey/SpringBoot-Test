package com.gzc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author: 拿破仑
 * @Date&Time: 2023/11/06  08:41  周一
 * @Project: SpringBootTest
 * @Write software: IntelliJ IDEA
 * @Purpose: 在此处编辑
 */
@SpringBootApplication
@MapperScan(basePackages = "com.gzc.dao")//扫描mapper接口
@EnableTransactionManagement//开启事务注解支持
public class SpringBootCaseApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootCaseApplication.class,args);
    }
}
