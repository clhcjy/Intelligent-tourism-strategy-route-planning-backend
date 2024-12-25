package com.coding24.mybatisdemo.service;

import com.coding24.mybatisdemo.entity.userProject;

import java.util.List;

public interface UserProjectService {
    public void deleteUserProject(int pid);
    public void insertUserProject(userProject userProject);
    public userProject selectUserProject(int pid);
    public void updateUserProject(userProject userProject);
    public List<userProject> searchAll();
    public List<userProject> searchByUid(int uid);
}
