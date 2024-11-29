package com.coding24.mybatisdemo.mapper;

import com.coding24.mybatisdemo.entity.comment;
import org.apache.ibatis.annotations.*;

@Mapper
public interface CommentMapper {
    @Select("select * from comment where id = #{id}")
    public comment findById(Integer id);

    @Select("select * from comment where DetailId = #{DetailId}")
    public comment[] findByDetailId(Integer DetailId);

    @Select("select * from comment where uid = #{uid}")
    public comment[] findByUid(Integer uid);

    @Select("select * from comment where user_project_id = #{user_project_id}")
    public comment[] findByUserProjectId(Integer user_project_id);

    @Select("select * from comment")
    public comment[] findAll();

    @Insert("insert into comment (uid, user_project_id, content, createTime, DetailId) values (#{uid}, #{user_project_id}, #{content}, #{createTime},#{DetailId})")
    public void insert(comment comment);

    @Delete("delete from comment where id = #{id}")
    public void deleteById(Integer id);

    @Update("update comment set uid = #{uid},user_project_id = #{user_project_id},content = #{content},createTime = #{createTime},DetailId = #{DetailId} where id = #{id}")
    public void update(comment comment);
}
