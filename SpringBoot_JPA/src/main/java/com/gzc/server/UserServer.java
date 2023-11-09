package com.gzc.server;

import com.gzc.pojo.User;

import java.util.List;

/**
 * @author: 拿破仑
 * @Date&Time: 2023/11/05  20:59  周日
 * @Project: SpringBootTest
 * @Write software: IntelliJ IDEA
 * @Purpose: 在此处编辑
 */
public interface UserServer {

    List<User> findUsers();

    User findUserById(Long id);

    void saveUser(User user);

    void updateUser(User user);

    void deleteUserById(Long id);

}
