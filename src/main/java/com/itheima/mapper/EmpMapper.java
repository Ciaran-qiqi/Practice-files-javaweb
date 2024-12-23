package com.itheima.mapper;

import com.itheima.pojo.Emp;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.time.LocalDate;
import java.util.List;

/**
 * 员工管理
 */
@Mapper
public interface EmpMapper {
    //获取当前页的结果列表(用xml动态配置sql)
    public List<Emp> list(String name, Short gender, LocalDate begin, LocalDate end);
}
