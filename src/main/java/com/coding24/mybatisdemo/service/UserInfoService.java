package com.coding24.mybatisdemo.service;

import com.coding24.mybatisdemo.entity.UserInfo;

public interface UserInfoService {
    public UserInfo[] getUserInfo();
    public String insertUserInfo(UserInfo userInfo);
    public String updateUserInfo(UserInfo userInfo);
    public String deleteUserInfo(Integer userId);
    public UserInfo getUserInfoById(Integer id);
    public UserInfo getUserInfoByUserId(Integer userId);
}
