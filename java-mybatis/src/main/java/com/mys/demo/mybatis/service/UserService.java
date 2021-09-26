package com.mys.demo.mybatis.service;

import com.mys.demo.mybatis.entity.User;

import java.util.List;

public interface UserService {
    public List<User> findAll();
}
