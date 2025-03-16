package com.coding24.mybatisdemo.service;

import com.coding24.mybatisdemo.entity.User;

public interface UserService {
    public User findById(Integer id);
    public User findByName(String name);
    public User findByPassword(String password);
    public User findByNameAndPassword(String name, String password);
    public void save(User user);
    public void update(User user);
    public void delete(Integer id);
    public User[] findAll();
}
