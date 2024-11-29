package com.coding24.mybatisdemo.service.impl;

import com.coding24.mybatisdemo.entity.comment;
import com.coding24.mybatisdemo.mapper.CommentMapper;
import com.coding24.mybatisdemo.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    private CommentMapper commentMapper;
    /**
     * @param id
     */
    @Override
    public void deleteById(Integer id) {
        commentMapper.deleteById(id);
    }

    /**
     * @return
     */
    @Override
    public comment[] findAll() {
        return commentMapper.findAll();
    }

    /**
     * @param DetailId
     * @return
     */
    @Override
    public comment[] findByDetailId(Integer DetailId) {
        return commentMapper.findByDetailId(DetailId);
    }

    /**
     * @param uid
     * @return
     */
    @Override
    public comment[] findByUid(Integer uid) {
        return commentMapper.findByDetailId(uid);
    }

    /**
     * @param user_project_id
     * @return
     */
    @Override
    public comment[] findByUserProjectId(Integer user_project_id) {
        return commentMapper.findByUserProjectId(user_project_id);
    }

    /**
     * @param id
     * @return
     */
    @Override
    public comment findById(Integer id) {
        return commentMapper.findById(id);
    }

    /**
     * @param comment
     */
    @Override
    public void insert(comment comment) {
        commentMapper.insert(comment);
    }

    /**
     * @param comment
     */
    @Override
    public void update(comment comment) {
        commentMapper.update(comment);
    }
}
