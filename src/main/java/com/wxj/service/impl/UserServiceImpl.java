package com.wxj.service.impl;

import com.wxj.dao.UserDao;
import com.wxj.pojo.User;
import com.wxj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {

    //小章的代码
    @Autowired
    private UserDao userDao;

    @Override
    public void add(User user) {
        userDao.save(user);
    }

    @Override
    public void update(Long id, User user) {
        user.setId(id);
        userDao.saveAndFlush(user);
    }

    @Override
    public void delete(Long id) {
        userDao.deleteById(id);
    }

    @Override
    public User findOne(Long id) {
        return userDao.findById(id).get();
    }

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }
}
