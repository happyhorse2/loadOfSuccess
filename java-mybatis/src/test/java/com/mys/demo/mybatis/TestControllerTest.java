package com.mys.demo.mybatis;

import com.mys.demo.mybatis.service.TestService;
import com.mys.demo.mybatis.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestControllerTest {

    @Autowired
    UserService userService;


    @Autowired
    TestService testService;

    @Test
    public void TestUserService(){
      //System.out.println(testService.findAll().size());
        System.out.println(userService.findAll().size());
    }
}
