package com.itheima.service;

import com.itheima.pojo.Dept;

import java.util.List;

/**
 * 部门管理
 */
public interface DeptService {
    /*
     * 查询所有部门
     * @return
     */
    List<Dept> list();

    /*
     *删除部门
     *@param id
     */
    void delete(Integer id);

    /*
     *添加部门
     *@param dept
     */
    void add(Dept dept);
}
