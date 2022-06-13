package com.lkcoffee.service.impl;

import com.lkcoffee.dao.UserDao;
import com.lkcoffee.entity.User;
import com.lkcoffee.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author xiongzhiming
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> findUsers() {
        return userDao.selectAllUsers();
    }

    @Override
    public List<User> findUserByName(String name) {
        return userDao.selectUserByName(name);
    }
}
