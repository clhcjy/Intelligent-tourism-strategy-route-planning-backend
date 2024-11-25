package com.coding24.mybatisdemo.service.impl;

import com.coding24.mybatisdemo.entity.userProject;
import com.coding24.mybatisdemo.mapper.UserProjectMapper;
import com.coding24.mybatisdemo.service.UserProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserProjectServiceImpl implements UserProjectService {

    @Autowired
    private UserProjectMapper userProjectMapper;

    /**
     * @param pid
     */
    @Override
    public void deleteUserProject(int pid) {
        userProjectMapper.deleteUserProject(pid);
    }

    /**
     * @param userProject
     */
    @Override
    public void insertUserProject(userProject userProject) {
        userProjectMapper.insertUserProject(userProject);
    }

    /**
     * @param pid
     * @return
     */
    @Override
    public String selectUserProject(int pid) {
        return userProjectMapper.selectUserProject(pid);
    }

    /**
     * @param userProject
     */
    @Override
    public void updateUserProject(userProject userProject) {
        userProjectMapper.updateUserProject(userProject);
    }

    /**
     * @return
     */
    @Override
    public List<userProject> searchAll() {
        return userProjectMapper.findAll();
    }
}
