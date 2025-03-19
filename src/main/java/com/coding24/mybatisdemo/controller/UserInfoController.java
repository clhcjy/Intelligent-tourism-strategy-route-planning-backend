package com.coding24.mybatisdemo.controller;

import com.coding24.mybatisdemo.entity.UserInfo;
import com.coding24.mybatisdemo.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/userInfo")
public class UserInfoController {
    @Autowired
    private UserInfoService userInfoService;

    @GetMapping("/getUserInfo")
    public UserInfo[] getUserInfo() {
        return userInfoService.getUserInfo();
    }

    @PostMapping("/insertUserInfo")
    public String insertUserInfo(UserInfo userInfo) {
        return userInfoService.insertUserInfo(userInfo);
    }

    @PostMapping("/updateUserInfo")
    public String updateUserInfo(UserInfo userInfo) {
        return userInfoService.updateUserInfo(userInfo);
    }

    @PostMapping("/deleteUserInfo")
    public String deleteUserInfo(Integer userId) {
        return userInfoService.deleteUserInfo(userId);
    }

    @PostMapping("/getUserInfoById")
    public UserInfo getUserInfoById(Integer id) {
        return userInfoService.getUserInfoById(id);
    }

    @PostMapping("/getUserInfoByUserId")
    public UserInfo getUserInfoByUserId(Integer userId) {
        return userInfoService.getUserInfoByUserId(userId);
    }

}
