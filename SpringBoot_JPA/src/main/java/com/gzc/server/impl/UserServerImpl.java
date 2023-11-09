package com.gzc.server.impl;

import com.gzc.dao.UserDao;
import com.gzc.pojo.User;
import com.gzc.server.UserServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: 拿破仑
 * @Date&Time: 2023/11/05  21:00  周日
 * @Project: SpringBootTest
 * @Write software: IntelliJ IDEA
 * @Purpose: 在此处编辑
 */
@Service
public class UserServerImpl implements UserServer {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> findUsers() {
        return userDao.findAll();
    }

    @Override
    public User findUserById(Long id) {
        return userDao.getOne(id);
    }

    @Override
    public void saveUser(User user) {
        userDao.save(user);
    }

    @Override
    public void updateUser(User user) {
        userDao.save(user);
    }

    @Override
    public void deleteUserById(Long id) {
        userDao.deleteById(id);
    }
}
