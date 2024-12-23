package com.coding24.mybatisdemo.mapper;

import com.coding24.mybatisdemo.entity.Points;
import org.apache.ibatis.annotations.*;

@Mapper
public interface PointsMapper {
    @Select("select * from points where position_id = #{position_id}")
    public Points findByPosition_id(int position_id);

    @Select("select * from points where pid = #{pid}")
    public Points[] findByPid(int pid);

    @Select("select * from points")
    public Points[] findAll();

    @Update("update points set title = #{title},lng = #{lng},lat = #{lat},pid = #{pid},address = #{address},province = #{province},city = #{city},tags = #{tags} where position_id = #{position_id}")
    public void updatePoints(Points points);

    @Delete("delete from points where position_id = #{position_id}")
    public void deletePoints(int position_id);

    @Insert("insert into points(title,lng,lat,pid,address,province,city,tags)" + "values(#{title},#{lng},#{lat},#{pid},#{address},#{province},#{city},#{tags})")
    @Options(useGeneratedKeys = true, keyProperty = "position_id")
    public int insertPoints(Points points);

}
