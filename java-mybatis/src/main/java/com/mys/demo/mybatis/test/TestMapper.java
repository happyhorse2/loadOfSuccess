package com.mys.demo.mybatis.test;

import com.mys.demo.mybatis.entity.Test;
import com.mys.demo.mybatis.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.io.ResolverUtil;

import java.util.List;

/**
 * @author mayansong
 */
//@Mapper
public interface TestMapper {
    /**
     *  查找用户
     * @return
     */
    public List<Test> findAll();
}
