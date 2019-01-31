package com.quhao.study.service;

import com.quhao.study.entity.Dept;

import java.util.List;

/**
 * @author: Stephen
 * @create: 2019-01-02 13:12
 **/
public interface DeptService {
    public boolean add(Dept dept);

    public Dept get(Long id);

    public List<Dept> list();
}
