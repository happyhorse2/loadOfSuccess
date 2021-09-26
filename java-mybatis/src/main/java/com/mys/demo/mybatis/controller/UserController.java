package com.mys.demo.mybatis.controller;

import com.mys.demo.mybatis.entity.User;
import com.mys.demo.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author mayansong
 */
@RestController
@RequestMapping("/user")
public class UserController {

//    @Autowired
//    private UserService userService;

    @RequestMapping("/findAll")
    public List<User> findAll(){
        //return userService.findAll();
        return null;
    }
}
