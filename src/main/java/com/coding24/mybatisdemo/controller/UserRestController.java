package com.coding24.mybatisdemo.controller;

import com.coding24.mybatisdemo.entity.User;
import com.coding24.mybatisdemo.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
public class UserRestController {
    @Autowired
    private UserService userService;

    @GetMapping("/findByIdRest/{id}")
    public User findById(@PathVariable("id") Integer id, Model model) {
        log.info("正在根据ID查找用户: {}", id);
        User user = userService.findById(id);
        log.info("找到的用户: {}", user);
        return user;
    }

    @PostMapping("/login")
    public User login(@RequestBody User user) {
        String username = user.getUsername();
        String password = user.getPassword();
        log.info("用户名为 {} 的用户尝试登录", username);
        User authenticatedUser = userService.findByNameAndPassword(username, password);
        if (authenticatedUser != null) {
            log.info("用户认证成功: {}", authenticatedUser);
        } else {
            log.warn("用户名为 {} 的用户登录失败", username);
        }
        return authenticatedUser;
    }

    @PostMapping("register")
    public String register(@RequestBody User user) {
        log.info("正在注册新用户: {}", user);
        userService.save(user);
        log.info("用户注册成功: {}", user);
        return "success";
    }
}
