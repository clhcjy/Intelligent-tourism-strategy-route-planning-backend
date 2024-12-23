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

    @Update("update user_project set uid = #{uid},projectName = #{projectName},picture = #{picture},category = #{category} where pid = #{pid}")
    public void updateUserProject(userProject userProject);

    @Insert("insert into user_project(uid,projectName)" + "values(#{uid},#{projectName})")
    @Options(useGeneratedKeys = true, keyProperty = "pid")
    public int insertUserProject(userProject userProject);

    @Select("select * from user_project")
    public List<userProject> findAll();

    @Select("select * from user_project where uid = #{uid}")
    public List<userProject> findByUid(int uid);
}
