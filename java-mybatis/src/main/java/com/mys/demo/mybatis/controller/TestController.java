package com.mys.demo.mybatis.controller;

import com.mys.demo.mybatis.entity.Test;
import com.mys.demo.mybatis.entity.User;
import com.mys.demo.mybatis.service.TestService;
import com.mys.demo.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author mayansong
 */
@RestController
@RequestMapping("/test")
public class TestController {

//    @Autowired
//    private TestService testService;

    @RequestMapping("/findAll")
    public List<Test> findAll(){
        //return testService.findAll();
        return null;
    }
}
