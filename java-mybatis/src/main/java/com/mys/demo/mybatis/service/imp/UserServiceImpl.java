package com.mys.demo.mybatis.service.imp;

import com.mys.demo.mybatis.entity.Test;
import com.mys.demo.mybatis.entity.User;
import com.mys.demo.mybatis.mapper.UserMapper;
import com.mys.demo.mybatis.service.UserService;
import com.mys.demo.mybatis.test.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author mayansong
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findAll(){
        return userMapper.findAll();
    }
}
