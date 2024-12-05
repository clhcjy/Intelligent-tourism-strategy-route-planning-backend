package com.coding24.mybatisdemo.controller;

import com.coding24.mybatisdemo.entity.userProject;
import com.coding24.mybatisdemo.service.UserProjectService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/project")
public class UserProjectController {
    private static final Logger logger = LoggerFactory.getLogger(UserProjectController.class);

    @Autowired
    private UserProjectService userProjectService;

    @PostMapping("/delete")
    public void deleteUserProject(int pid) {
        logger.info("删除项目，项目ID: {}", pid);
        userProjectService.deleteUserProject(pid);
        logger.info("项目删除成功，项目ID: {}", pid);
    }

    @PostMapping("/insert")
    public userProject insertUserProject(@RequestBody userProject userProject) {
        logger.info("插入项目，项目信息: {}", userProject);
        userProjectService.insertUserProject(userProject);
        logger.info("项目插入成功，项目信息: {}", userProject);
        return userProject;
    }

    @PostMapping("/select")
    public String selectUserProject(int pid) {
        logger.info("查询项目，项目ID: {}", pid);
        String result = userProjectService.selectUserProject(pid);
        logger.info("项目查询成功，项目ID: {}, 结果: {}", pid, result);
        return result;
    }

    @PostMapping("/update")
    public void updateUserProject(@RequestBody userProject userProject) {
        logger.info("更新项目，项目信息: {}", userProject);
        userProjectService.updateUserProject(userProject);
        logger.info("项目更新成功，项目信息: {}", userProject);
    }

    @GetMapping("/searchAll")
    public List<userProject> searchAll() {
        logger.info("查询所有项目");
        List<userProject> result = userProjectService.searchAll();
        logger.info("查询所有项目成功，结果: {}", result);
        return result;
    }

    @PostMapping("/searchByUid")
    public List<userProject> searchByUid(@RequestParam int uid) {
        logger.info("查询用户项目，用户ID: {}", uid);
        List<userProject> result = userProjectService.searchByUid(uid);
        logger.info("查询用户项目成功，用户ID: {}, 结果: {}", uid, result);
        return result;
    }
}
