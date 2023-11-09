package com.gzc.server;

import com.gzc.pojo.User;

import java.util.List;

public interface UserServer {

    List<User> findall();

    User finduserbyid(Integer id);
}
