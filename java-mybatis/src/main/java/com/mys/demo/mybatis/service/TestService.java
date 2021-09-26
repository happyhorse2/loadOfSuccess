package com.mys.demo.mybatis.service;

import com.mys.demo.mybatis.entity.Test;
import com.mys.demo.mybatis.entity.User;

import java.util.List;

/**
 * @author mayansong
 */
public interface TestService {
    public List<Test> findAll();
}
