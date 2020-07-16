package com.example.mybatis.mapper;
import com.example.mybatis.entity.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * <h2>用户持久化映射</h2>
 *
 * @author March
 * @date 2020/7/15
 */
public interface UserMapper {

    @Select("select id, name, age, sex from tb_user; ")
    List<User> selectByUser();

    @Select("select id, name, age, sex from user where id = #{id}; ")
    User selectByPrimaryKey(String id);

    @Insert("insert into tb_user(id, name, age, sex) values(#{id}, #{name}, #{age}, #{sex}); ")
    int insert(User user);

    @Delete("delete from tb_user where id = #{id}")
    int deleteByPrimaryKey(String id);

    @Update("update tb_user set id = #{id}, name = #{name}, age = #{age}, sex = #{sex} where id = #{id}; ")
    int updateByUser(User user);
}
