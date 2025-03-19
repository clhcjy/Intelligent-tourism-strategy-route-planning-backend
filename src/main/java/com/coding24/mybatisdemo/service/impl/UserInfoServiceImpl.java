package com.coding24.mybatisdemo.service.impl;

import com.coding24.mybatisdemo.entity.UserInfo;
import com.coding24.mybatisdemo.mapper.UserInfoMapper;
import com.coding24.mybatisdemo.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;
    /**
     * @return
     */
    @Override
    public UserInfo[] getUserInfo() {
        return userInfoMapper.getUserInfoList();
    }

    /**
     * @param userInfo
     * @return
     */
    @Override
    public String insertUserInfo(UserInfo userInfo) {
        userInfoMapper.insertUserInfo(userInfo);
        return "success";
    }

    /**
     * @param userInfo
     * @return
     */
    @Override
    public String updateUserInfo(UserInfo userInfo) {
        userInfoMapper.updateUserInfo(userInfo);
        return "success";
    }

    /**
     * @param userId
     * @return
     */
    @Override
    public String deleteUserInfo(Integer userId) {
        userInfoMapper.deleteUserInfo(userId);
        return "success";
    }
    /**
     * @param id
     * @return
     */
    @Override
    public UserInfo getUserInfoById(Integer id) {
        return userInfoMapper.getUserInfoById(id);
    }

    /**
     * @param userId
     * @return
     */
    @Override
    public UserInfo getUserInfoByUserId(Integer userId) {
        return userInfoMapper.getUserInfoByUserId(userId);
    }
}
