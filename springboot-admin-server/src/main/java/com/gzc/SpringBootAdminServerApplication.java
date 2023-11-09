package com.gzc;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author: 拿破仑
 * @Date&Time: 2023/11/06  10:26  周一
 * @Project: SpringBootTest
 * @Write software: IntelliJ IDEA
 * @Purpose: 在此处编辑
 */
@SpringBootApplication
@EnableAdminServer//服务管理
public class SpringBootAdminServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootAdminServerApplication.class,args);
    }
}
