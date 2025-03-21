package com.coding24.mybatisdemo.controller;

import com.coding24.mybatisdemo.entity.User;
import com.coding24.mybatisdemo.service.UserService;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.constraints.Pattern;
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

    // 登录接口
    @PostMapping("/login")
    @ResponseBody
    public String login(@RequestBody User user, HttpServletResponse response){
        String result = userService.login(user, response);
        return result;
    }

    @PostMapping("/register")
    public String register( @RequestBody User user) {
        log.info("正在注册新用户: {}", user);
        userService.save(user);
        log.info("用户注册成功: {}", user);
        return "success";
    }
}
