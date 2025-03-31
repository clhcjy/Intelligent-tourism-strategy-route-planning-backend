package com.coding24.mybatisdemo.controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import com.coding24.mybatisdemo.entity.User;
import com.coding24.mybatisdemo.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.HtmlUtils;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@RestController
public class UserRestController {

    @Autowired
    private UserService userService;

    @GetMapping("/findAllUser")
    public User[] findAllUser() {
        log.info("正在查找所有用户");
        User[] users = userService.findAll();
        log.info("找到的所有用户: {}", users);
        return users;
    }

    @GetMapping("/findByIdRest/{id}")
    public ResponseEntity<Map<String, String>> findById(
            @PathVariable("id") Integer id) {
        log.info("正在根据ID查找用户: {}", id);
        User user = userService.findById(id);
        log.info("找到的用户: {}", user);
        // 防止XSS攻击，对返回的字符串进行转义
        Map<String, String> result = new HashMap<>();
        result.put("id", HtmlUtils.htmlEscape(String.valueOf(user.getId())));
        result.put("username", HtmlUtils.htmlEscape(user.getUsername()));
        result.put("avatarUrl", HtmlUtils.htmlEscape(user.getAvatarUrl()));
        return ResponseEntity.ok(result);
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

    @PostMapping("/register")
    public String register( @RequestBody User user) {
        log.info("正在注册新用户: {}", user);
        userService.save(user);
        log.info("用户注册成功: {}", user);
        return "success";
    }
}
