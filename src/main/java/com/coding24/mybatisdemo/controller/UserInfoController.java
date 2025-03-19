package com.coding24.mybatisdemo.controller;

import com.coding24.mybatisdemo.entity.UserInfo;
import com.coding24.mybatisdemo.service.UserInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/userInfo")
public class UserInfoController {
    private static final Logger logger = LoggerFactory.getLogger(UserInfoController.class);

    @Autowired
    private UserInfoService userInfoService;

    @GetMapping("/getUserInfo")
    public UserInfo[] getUserInfo() {
        logger.info("获取所有用户信息");
        return userInfoService.getUserInfo();
    }

    @PostMapping("/insertUserInfo")
    public String insertUserInfo(@RequestBody UserInfo userInfo) {
        logger.info("插入用户信息: {}", userInfo);
        return userInfoService.insertUserInfo(userInfo);
    }

    @PostMapping("/updateUserInfo")
    public String updateUserInfo(@RequestBody UserInfo userInfo) {
        logger.info("更新用户信息: {}", userInfo);
        return userInfoService.updateUserInfo(userInfo);
    }

    @PostMapping("/deleteUserInfo")
    public String deleteUserInfo(@RequestParam Integer userId) {
        logger.info("删除用户信息, 用户ID: {}", userId);
        return userInfoService.deleteUserInfo(userId);
    }

    @PostMapping("/getUserInfoById")
    public UserInfo getUserInfoById(@RequestParam Integer id) {
        logger.info("根据ID获取用户信息, ID: {}", id);
        return userInfoService.getUserInfoById(id);
    }

    @PostMapping("/getUserInfoByUserId")
    public UserInfo getUserInfoByUserId(@RequestParam Integer userId) {
        logger.info("根据用户ID获取用户信息, 用户ID: {}", userId);
        return userInfoService.getUserInfoByUserId(userId);
    }
}
