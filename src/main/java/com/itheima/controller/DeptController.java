package com.itheima.controller;

import com.itheima.mapper.DeptMapper;
import com.itheima.pojo.Dept;
import com.itheima.pojo.Result;
import com.itheima.service.DeptService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 部门管理Controller
 */
@Slf4j //日志注解
@RestController
@RequestMapping("/depts")
public class DeptController {

    @Autowired
    private DeptService deptService;

    /*
     * 查询部门数据
     * @return
     */
    @GetMapping
    public Result list(){
        log.info("查询全部部门数据");

        //调用业务层查询全部部门数据
        List<Dept> deptList = deptService.list();

        return Result.success(deptList);
    }
    /*
     * 删除部门数据
     * @return
     */
    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id){

        log.info("删除部门数据id：{}",id);
        //调用业务层查询全部部门数据
        deptService.delete(id);
        return Result.success();
    }
    /*
     * 添加部门数据
     * @return
     */
    @PostMapping
    public Result add(@RequestBody Dept dept){
        log.info("添加部门数据：{}",dept);
        //调用业务层查询全部部门数据
        deptService.add(dept);
        return Result.success();
    }


}
