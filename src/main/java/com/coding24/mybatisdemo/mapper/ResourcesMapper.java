package com.coding24.mybatisdemo.mapper;

import com.coding24.mybatisdemo.entity.resources;
import org.apache.ibatis.annotations.*;

@Mapper
public interface ResourcesMapper {
    @Select("select * from resources")
    resources[] findAll();

    @Select("select * from resources where id = #{id}")
    resources findById(Integer id);

    @Delete("delete from resources where id = #{id}")
    void deleteById(Integer id);

    @Update("update resources set title = #{title}, content = #{content}, link = #{link}, classification = #{classification} where id = #{id}")
    void update(resources resources);

    @Insert("insert into resources (title, content, link, classification) values (#{title}, #{content}, #{link}, #{classification})")
    void insert(resources resources);

    @Select("select * from resources where classification = #{classification}")
    resources[] findByClassification(String classification);

    @Select("select * from resources where title like concat('%', #{title}, '%')")
    resources[] findByTitle(String title);
}
