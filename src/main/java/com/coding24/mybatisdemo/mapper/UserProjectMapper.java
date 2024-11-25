package com.coding24.mybatisdemo.mapper;

import com.coding24.mybatisdemo.entity.userProject;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserProjectMapper {
    @Select("select * from user_project where pid = #{pid}")
    public String selectUserProject(int pid);

    @Delete("delete from user_project where pid = #{pid}")
    public void deleteUserProject(int pid);

    @Update("update user_project set uid = #{uid},projectName = #{projectName}")
    public void updateUserProject(userProject userProject);

    @Insert("insert into user_project(uid,projectName)" + "values(#{uid},#{projectName})")
    public void insertUserProject(userProject userProject);

    @Select("select * from user_project")
    public List<userProject> findAll();
}
