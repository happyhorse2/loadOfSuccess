package com.mys.demo.mybatis.service.imp;

import com.mys.demo.mybatis.entity.Test;
import com.mys.demo.mybatis.service.TestService;
import com.mys.demo.mybatis.test.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author mayansong
 */
@Service
public class TestServiceImpl implements TestService {

    //@Autowired
    TestMapper testMapper;

    @Override
    public List<Test> findAll() {
        return null;
//        return testMapper.findAll();
    }
}
