package com.gzc;

import com.gzc.dao.UserMapper;
import com.gzc.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import java.util.List;

/**
 * @author: 拿破仑
 * @Date&Time: 2023/11/06  08:52  周一
 * @Project: SpringBootTest
 * @Write software: IntelliJ IDEA
 * @Purpose: 在此处编辑
 */
@SpringBootTest
public class SpringTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void test1(){
        List<User> users = userMapper.selectAll();
        for (User user : users) {
            System.out.println("user = " + user);
        }
    }
}
