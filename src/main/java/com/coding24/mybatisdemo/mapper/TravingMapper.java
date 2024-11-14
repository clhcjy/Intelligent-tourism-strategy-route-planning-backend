package com.coding24.mybatisdemo.mapper;

import com.coding24.mybatisdemo.entity.Traving;
import org.apache.ibatis.annotations.*;

@Mapper
public interface TravingMapper {
    @Insert("insert into traving(city,uid,startTime,endTime)" + "values(#{city},#{uid},#{startTime},#{endTime})")
    public void insertTraving(Traving traving);

    @Delete("delete from traving where tid=#{tid}")
    public void deleteTraving(int tid);

    @Select("select * from traving where tid=#{tid}")
    public Traving selectTraving(int tid);

    @Select("select * from traving where uid=#{uid}")
    public Traving selectTravingByUid(int uid);

    @Update("update set tid = #{tid},city = #{city},uid = #{uid},startTime = #{startTime},endTime = #{endTime}")
    public void updateTraving(Traving traving);
}