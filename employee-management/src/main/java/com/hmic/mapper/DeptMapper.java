package com.hmic.mapper;

import com.hmic.pojo.Dept;
import org.apache.ibatis.annotations.*;


import java.util.List;

@Mapper
public interface  DeptMapper {

@Select("select * from dept")
 List<Dept>list();

@Delete("DELETE from dept where id = #{id}")
 void deleteById(Integer id);

@Insert("insert into dept(name,create_time,update_time) values " +
        "(#{name}," +
        "#{createTime}," +
        "#{updateTime})")
 void insert(Dept dept);

@Select("select * from dept where id = #{id}")
 Dept show(Integer id);

 @Update("update dept set name = #{name},update_time = #{updateTime} where id = #{id}")
 void edit(Dept dept);
}
