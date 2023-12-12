package com.hmic.controller;
import com.hmic.pojo.Dept;
import com.hmic.pojo.Result;
import com.hmic.service.DeptService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Slf4j
@RestController
@RequestMapping("/depts")
public class DeptController {
    @Autowired
    private DeptService deptService;

    @GetMapping
    public Result list(){
        log.info("inquire all department info");
        List<Dept> deptList = deptService.list();
        return Result.success(deptList);
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable  Integer id){
    log.info("delete department according to id: {}",id);
    deptService.delete(id);
    return Result.success();
    }
    @PostMapping
    public Result add(@RequestBody Dept dept){
        log.info("adding new department: {}",dept);
        deptService.add(dept);
        return Result.success();
    }
    @GetMapping("/{id}")
    public Result selectById(@PathVariable Integer id){
        log.info("show info about department with id: {}",id);
        Dept dept = deptService.show(id);
        return Result.success(dept);
    }
    @PutMapping
    public Result edit(@RequestBody Dept dept){
        log.info("edit department: {} to {}",dept.getId(),dept.getName());
        deptService.edit(dept);
        return Result.success();

    }

}
