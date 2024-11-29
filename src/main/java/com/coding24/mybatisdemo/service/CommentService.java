package com.coding24.mybatisdemo.service;

import com.coding24.mybatisdemo.entity.comment;

public interface CommentService {
    void deleteById(Integer id);
    comment[] findAll();
    comment[] findByDetailId(Integer DetailId);
    comment[] findByUid(Integer uid);
    comment[] findByUserProjectId(Integer user_project_id);
    comment findById(Integer id);
    void insert(comment comment);
    void update(comment comment);
}
