package com.gzc.controller;

import com.gzc.pojo.User;
import com.gzc.server.UserServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: 拿破仑
 * @Date&Time: 2023/11/05  21:05  周日
 * @Project: SpringBootTest
 * @Write software: IntelliJ IDEA
 * @Purpose: 在此处编辑
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserServer userServer;

    @RequestMapping("/findAll")
    private List<User> findall(){
        List<User> users = userServer.findUsers();
        return users;
    }

}
