package com.coding24.mybatisdemo.mapper;

import com.coding24.mybatisdemo.entity.OtherPoints;
import org.apache.ibatis.annotations.*;

@Mapper
public interface OtherPointsMapper {
    @Select("select * from otherpoints where OtherPoints_id = #{OtherPoints_id}")
    public OtherPoints findByOtherPoints_id(int OtherPoints_id);

    @Select("select * from otherpoints")
    public OtherPoints[] findAll();

    @Select("select * from otherpoints where point_address = #{point_address} AND category = #{category}")
    public OtherPoints[] findByPoint_address(String point_address,String category);

    @Insert("INSERT INTO otherpoints (address, title, lng, lat, point_address, province, city, tags,category) " +
            "VALUES (#{address}, #{title}, #{lng}, #{lat}, #{point_address}, #{province}, #{city}, #{tags}, #{category}) " +
            "ON DUPLICATE KEY UPDATE " + "title = VALUES(title), " + "lng = VALUES(lng), " + "lat = VALUES(lat), " + "point_address = VALUES(point_address), " + "province = VALUES(province), " + "city = VALUES(city), " + "tags = VALUES(tags)," + "category = VALUES(category)")
    @Options(useGeneratedKeys = true, keyProperty = "OtherPoints_id")
    public int insertOtherPoints(OtherPoints otherPoints);


    @Update("update otherpoints set point_address = #{point_address}, title = #{title},lng = #{lng},lat = #{lat},address = #{address},province = #{province},city = #{city},tags = #{tags} where OtherPoints_id = #{OtherPoints_id}")
    public void updateOtherPoints(OtherPoints otherPoints);

    @Delete("delete from otherpoints where OtherPoints_id = #{OtherPoints_id}")
    public void deleteOtherPoints(int OtherPoints_id);
}
