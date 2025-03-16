package com.coding24.mybatisdemo.mapper;
import com.coding24.mybatisdemo.entity.User;
import org.apache.ibatis.annotations.*;

@Mapper
public interface UserMapper {
    @Select("select * from user where id = #{id}")
    public User findById(Integer id);

    @Select("select * from user")
    public User[] findAll();

    @Select("select * from user where username = #{username}")
    public User findByusername(String username);

    @Select("select * from user where password = #{password}")
    public User findByPassword(String password);

    @Select("select * from user where username = #{username} and password = #{password}")
    public User findByusernameAndPassword(String username, String password);

    @Insert("insert into user(username, password,avatarUrl)"+" values(#{username}, #{password},#{avatarUrl})")
    public void save(User user);

    @Update("update user set username = #{username}, password = #{password} where id = #{id}")
    public void update(User user);

    @Delete("delete from user where id = #{id}")
    public void delete(Integer id);

}
