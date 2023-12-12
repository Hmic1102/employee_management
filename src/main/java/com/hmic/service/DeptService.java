package com.hmic.service;

import com.hmic.pojo.Dept;

import java.util.List;

public interface DeptService {
    List<Dept> list();

    void delete(Integer id);

    void add(Dept dept);

    Dept show(Integer id);

    void edit(Dept dept);
}
