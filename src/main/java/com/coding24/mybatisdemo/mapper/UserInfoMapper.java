package com.coding24.mybatisdemo.mapper;

import com.coding24.mybatisdemo.entity.UserInfo;
import org.apache.ibatis.annotations.*;

@Mapper
public interface UserInfoMapper {
    @Select("select * from user_info where user_id = #{userId}")
    UserInfo getUserInfoByUserId(Integer userId);

    @Select("select * from user_info where id = #{id}")
    UserInfo getUserInfoById(Integer id);

    @Select("select * from user_info")
    UserInfo[] getUserInfoList();

    @Insert("insert into user_info (user_id, cell_phone_number, email,self_introduction,theme,Privacy_settings,language,Visitor_record) values (#{user_id}, #{cell_phone_number}, #{email},#{self_introduction},#{theme},#{Privacy_settings},#{language},#{Visitor_record})")
    void insertUserInfo(UserInfo userInfo);

    @Update("update user_info set cell_phone_number = #{cell_phone_number}, email = #{email},self_introduction = #{self_introduction},theme = #{theme},Privacy_settings = #{Privacy_settings},language = #{language},Visitor_record = #{Visitor_record} where user_id = #{user_id}")
    void updateUserInfo(UserInfo userInfo);

    @Delete("delete from user_info where user_id = #{user_id}")
    void deleteUserInfo(Integer userId);
}
