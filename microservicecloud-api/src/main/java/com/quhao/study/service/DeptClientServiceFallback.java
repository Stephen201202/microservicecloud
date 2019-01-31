package com.quhao.study.service;

import com.quhao.study.entity.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author: Stephen
 * @create: 2019-01-06 13:29
 **/
@Component
public class DeptClientServiceFallback implements FallbackFactory<DeptClientServiceFeign> {
    @Override
    public DeptClientServiceFeign create(Throwable cause) {
        return new DeptClientServiceFeign() {
            @Override
            public Dept get(long id)
            {
                return new Dept().setDeptno(id).setDname("该ID：" + id + "没有没有对应的信息,Consumer客户端提供的降级信息,此刻服务Provider已经关闭")
                        .setDb_source("no this database in MySQL");
            }

            @Override
            public List<Dept> list() {
                return null;
            }

            @Override
            public boolean add(Dept dept) {
                return false;
            }
        };
    }
}
