package com.quhao.study.dao;

import com.quhao.study.entity.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author: Stephen
 * @create: 2019-01-02 11:14
 **/
@Mapper
public interface DeptDao {
    public boolean addDept(Dept dept);

    public Dept findById(Long id);

    public List<Dept> findAll();
}
