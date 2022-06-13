package com.lkcoffee.service;

import com.lkcoffee.entity.User;

import java.util.List;

/**
 * @author xiongzhiming
 */
public interface UserService {
    /**
     * 查询所有用户信息
     * @return
     */
    List<User> findUsers();

    /**
     * 根据用户名称查询用户
     * @param name
     * @return
     */
    List<User> findUserByName(String name);
}
