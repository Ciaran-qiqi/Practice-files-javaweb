package com.itheima.controller;

import com.itheima.pojo.Dept;
import com.itheima.pojo.Result;
import com.itheima.service.DeptService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 部门管理Controller
 */
@Slf4j
@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;


    @GetMapping("/depts")
    public Result list(){
        log.info("查询全部部门数据");

        //调用业务层查询全部部门数据
        List<Dept> deptList = deptService.list();

        return Result.success(deptList);
    }

}
