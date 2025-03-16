package com.coding24.mybatisdemo.mapper;

import com.coding24.mybatisdemo.entity.Records;

import org.apache.ibatis.annotations.*;

@Mapper
public interface RecordMapper {
    @Select("select * from record where id = #{id}")
    Records findById(int id);

    @Select("select * from record where uid = #{uid}")
    Records[] findByUid(int uid);

    @Select("select * from record where login_time = #{time}")
    Records[] findByTime(String time);

    @Insert("insert into record(uid) values(#{uid})")
    void insert(int uid);

    @Delete("delete from record where id = #{id}")
    void deleteById(int id);

    @Update("update record set uid = #{uid} where id = #{id}")
    void update(int uid);

    @Select("select * from record ORDER BY login_time DESC")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "uid", column = "uid"),
            @Result(property = "time", column = "login_time")
    })
    Records[] findAll();
}
