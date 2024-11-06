package com.coding24.mybatisdemo.mapper;

import com.coding24.mybatisdemo.entity.Area;
import org.apache.ibatis.annotations.*;

@Mapper
public interface AreaMapper {
    @Select("select * from area")
    public Area findAll();

    @Select("select * from area where aid = #{aid}")
    public Area findById(int aid);

    @Select("select * from area where Province = #{province}")
    public Area findByProvince(String Province);

    @Select("select * from area where City = #{city}")
    public Area findByCity(String City);

    @Select("select * from area where District = #{district}")
    public Area findByDistrict(String District);

    @Select("select * from area where Street = #{street}")
    public Area findByStreet(String Street);

    @Select("select * from area where Address = #{address}")
    public Area findByAddress(String Address);

    @Insert("insert into area(Province, City, District, Street, Address)"+
            "values(#{province}, #{city}, #{district}, #{street}, #{address})")
    public void insert(Area area);

    @Update("update area set Provice = #{provice}, City = #{city}, District = #{district}, Street = #{street}, Addess = #{address}")
    public void update(Area area);

    @Delete("delete from area where aid = #{aid}")
    public void delete(int aid);
}
