package com.gzc.test;

import com.gzc.dao.UserDao;
import com.gzc.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


/**
 * @author: 拿破仑
 * @Date&Time: 2023/11/05  21:24  周日
 * @Project: SpringBootTest
 * @Write software: IntelliJ IDEA
 * @Purpose: 在此处编辑
 */
@SpringBootTest
public class JPATest {

    @Autowired
    private UserDao userDao;

    @Test
    //测试插入
    public void testSave(){
        User user = new User();
        user.setName("张晓三");
        user.setPassword("333333");
        user.setUsername("你好啊人类");
        user.setId(1L);

        userDao.save(user);

    }
}
