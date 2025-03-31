package com.coding24.mybatisdemo.service.impl;

import com.coding24.mybatisdemo.entity.User;
import com.coding24.mybatisdemo.mapper.UserMapper;
import com.coding24.mybatisdemo.service.UserService;
import com.coding24.mybatisdemo.util.TokenUtil;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    TokenUtil tokenUtil;

    @Override
    public String login(User user, HttpServletResponse response) {
        User user2 = userMapper.findByusername(user.getUsername());
        if (user2 == null) {
            return "该用户不存在！";
        }
        if (!user2.getPassword().equals(user.getPassword())) {
            return "密码错误！";
        }
        String token = tokenUtil.generateToken(user2);
        Cookie cookie = new Cookie("token", token);
//        设置cookie的作用域：为”/“时，以在webapp文件夹下的所有应用共享cookie
        cookie.setPath("/");
        response.addCookie(cookie);
        return "登录成功！";
    }

    @Override
    public User login(String name, String password) {
        User user2 = userMapper.findByusername(name);

        return user2;
    }

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

    /**
     * @return
     */
    @Override
    public User[] findAll() {
        return userMapper.findAll();
    }

}
