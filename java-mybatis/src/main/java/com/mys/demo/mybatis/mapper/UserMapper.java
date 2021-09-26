package com.mys.demo.mybatis.mapper;

import com.mys.demo.mybatis.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author mayansong
 */
@Mapper
//mapperScan和Mapper最终指向的目标的接口，都是要链接数据库查询的。
// mapperScan扫描的接口不要包含别的interface(不链接数据库的)
//写了mapperScan后，mapper修饰的借口要在mapperScan扫描路径内
//mapperScan可以不写，但写了就要遵守上面的规范

public interface UserMapper {
    /**
     *  查找用户
     * @return
     */
    public List<User> findAll();
}
