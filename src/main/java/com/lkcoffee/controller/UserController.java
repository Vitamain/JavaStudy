package com.lkcoffee.controller;

import com.lkcoffee.entity.User;
import com.lkcoffee.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author xiongzhiming
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/get")
    public List<User> getUsers() {
        return userService.findUsers();
    }

    @RequestMapping("/getUser")
    public List<User> getUsersByName(String username) {
        return userService.findUserByName(username);
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String Login(@RequestBody User user) {
        System.out.println(user);
        if (user.getUsername() != null && user.getPassword() != null) {
            return "login success";
        }
        return "login fail";
    }
}
