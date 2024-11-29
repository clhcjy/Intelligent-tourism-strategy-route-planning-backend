package com.coding24.mybatisdemo.controller;

import com.coding24.mybatisdemo.entity.comment;
import com.coding24.mybatisdemo.service.CommentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/comment")
public class CommentController {
    private static final Logger logger = LoggerFactory.getLogger(CommentController.class);

    @Autowired
    private CommentService commentService;

    @PostMapping("/deleteById")
    public void deleteById(@RequestParam Integer id) {
        logger.info("开始删除评论, ID: {}", id);
        commentService.deleteById(id);
        logger.info("评论删除成功, ID: {}", id);
    }

    @GetMapping("/findAll")
    public comment[] findAll() {
        logger.info("开始查找所有评论");
        comment[] comments = commentService.findAll();
        logger.info("所有评论查找成功, 数量: {}", comments.length);
        return comments;
    }

    @PostMapping("/findByuid")
    public comment[] findByUid(@RequestParam Integer uid) {
        logger.info("开始查找用户ID为 {} 的评论", uid);
        comment[] comments = commentService.findByUid(uid);
        logger.info("用户ID为 {} 的评论查找成功, 数量: {}", uid, comments.length);
        return comments;
    }

    @PostMapping("/findByDetailId")
    public comment[] findByDetailId(@RequestParam Integer DetailId) {
        logger.info("开始查找详情ID为 {} 的评论", DetailId);
        comment[] comments = commentService.findByDetailId(DetailId);
        logger.info("详情ID为 {} 的评论查找成功, 数量: {}", DetailId, comments.length);
        return comments;
    }

    @PostMapping("/findById")
    public comment findById(@RequestBody Integer id) {
        logger.info("开始查找评论, ID: {}", id);
        comment comment = commentService.findById(id);
        logger.info("评论查找成功, ID: {}, 评论: {}", id, comment);
        return comment;
    }

    @PostMapping("/findByUserProjectId")
    public comment[] findByUserProjectId(@RequestParam Integer userProjectId) {
        logger.info("开始查找用户项目ID为 {} 的评论", userProjectId);
        comment[] comments = commentService.findByUserProjectId(userProjectId);
        logger.info("用户项目ID为 {} 的评论查找成功, 数量: {}", userProjectId, comments.length);
        return comments;
    }

    @PostMapping("/insert")
    public void insert(@RequestBody comment comment) {
        logger.info("开始插入评论: {}", comment);
        commentService.insert(comment);
        logger.info("评论插入成功: {}", comment);
    }

    @PostMapping("/update")
    public void update(@RequestBody comment comment) {
        logger.info("开始更新评论: {}", comment);
        commentService.update(comment);
        logger.info("评论更新成功: {}", comment);
    }
}
