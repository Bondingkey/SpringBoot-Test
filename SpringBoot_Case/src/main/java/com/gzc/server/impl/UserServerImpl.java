package com.gzc.server.impl;

import com.gzc.dao.UserMapper;
import com.gzc.pojo.User;
import com.gzc.server.UserServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: 拿破仑
 * @Date&Time: 2023/11/06  09:11  周一
 * @Project: SpringBootTest
 * @Write software: IntelliJ IDEA
 * @Purpose: 在此处编辑
 */
@Service
public class UserServerImpl implements UserServer {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private RedisTemplate redisTemplate;

    @Override
    public List<User> findall() {
        //去redis缓存中查找所有数据
        List<User> userList = (List<User>) redisTemplate.boundValueOps("userList").get();
        if (userList == null){
            //第一次查询,无缓存
            userList = userMapper.selectAll();
            //放入缓存
            redisTemplate.boundValueOps("userList").set(userList);
            System.out.println("查询数据库");
        }
        System.out.println("查询缓存");
        return userList;
    }

    @Override
    public User finduserbyid(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
