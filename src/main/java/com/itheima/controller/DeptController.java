package com.itheima.controller;

import com.itheima.pojo.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 部门管理Controller
 */
@Slf4j
@RestController
public class DeptController {


    @GetMapping("/depts")
    public Result list(){
        log.info("查询全部部门数据");
        return Result.success();
    }

}
