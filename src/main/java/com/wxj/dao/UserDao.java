package com.wxj.dao;

import com.wxj.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User,Long> {
    public User findByNameIs(String name);

    public User findByNameAndAge(String name,Integer age);

}
