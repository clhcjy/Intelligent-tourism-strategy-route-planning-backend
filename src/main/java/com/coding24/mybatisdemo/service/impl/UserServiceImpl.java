package com.coding24.mybatisdemo.service.impl;

import com.coding24.mybatisdemo.entity.User;
import com.coding24.mybatisdemo.mapper.UserMapper;
import com.coding24.mybatisdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User findById(Integer id) {
        return userMapper.findById(id);
    }

    @Override
    public User findByName(String username) {
        return userMapper.findByusername(username);
    }

    @Override
    public User findByPassword(String password) {
        return userMapper.findByPassword(password);
    }

    @Override
    public User findByNameAndPassword(String username, String password) {
        return userMapper.findByusernameAndPassword(username, password);
    }

    @Override
    public void save(User user) {
        userMapper.save(user);
        System.out.println(user);
    }

    @Override
    public void update(User user) {
        userMapper.update(user);
    }

    @Override
    public void delete(Integer id) {
        userMapper.delete(id);
    }
}
