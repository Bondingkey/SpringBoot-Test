package com.gzc.dao;

import com.gzc.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author: 拿破仑
 * @Date&Time: 2023/11/05  20:56  周日
 * @Project: SpringBootTest
 * @Write software: IntelliJ IDEA
 * @Purpose: 在此处编辑
 */
public interface UserDao extends JpaRepository<User,Long> {
}
