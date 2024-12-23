package com.itheima.mapper;

import com.itheima.pojo.Dept;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.web.bind.annotation.DeleteMapping;

import java.util.List;

/**
 * 部门管理
 */
@Mapper
public interface DeptMapper {
    /*
     * 查询所有部门
     * @Return
     */
    @Select("select * from dept")
    List<Dept> list();

    /*
     * 根据id删除部门
     * @Param id
     */
    @Delete("delete from dept where id = #{id}")
    void deleteById(Integer id);

    /*
     * 添加部门
     * @Param dept
     */
    @Insert("insert into dept(name,create_time,update_time) values(#{name},#{createTime},#{updateTime})")
    void insert(Dept dept);
}
