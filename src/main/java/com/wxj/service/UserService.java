package com.wxj.service;

import com.wxj.pojo.User;
import org.springframework.stereotype.Service;

import java.util.List;
//线上修改了
public interface UserService {
    //新增用户
    public void add(User user);

    //修改
    public void update(Long id,User user);

    //删除
    public void delete(Long id);

    //根据id获取用户信息
    public User findOne(Long id);

    //获取全部用户信息
    public List<User> findAll();

}
