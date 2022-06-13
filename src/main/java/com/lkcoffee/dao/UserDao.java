package com.lkcoffee.dao;

import com.lkcoffee.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author xiongzhiming
 */
@Mapper
public interface UserDao {

    /**
     * 查询所有用户信息
     * @return
     */
    @Select("select id, name, age from user")
    List<User> selectAllUsers();

    /**
     * 根据用户名称查询用户信息
     * @param name
     * @return
     */
    @Select("select id, name, age from user where name = #{name}")
    List<User> selectUserByName(String name);
}
