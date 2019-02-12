package com.wisrc.microservice;


import com.wisrc.microservice.dao.cassandra.DemoDao;
import com.wisrc.microservice.dao.mysql.ZuulWhiteListDao;
import com.wisrc.microservice.entity.DemoEmp;
import com.wisrc.microservice.entity.ZuulWhiteList;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CassandraTest {

    @Autowired
    private DemoDao demoDao;

    @Autowired
    private ZuulWhiteListDao zuulWhiteListDao;

    @Test
    public void loadContext(){
        List<DemoEmp> result = demoDao.findAll();
        for(DemoEmp item: result) {
            System.out.println(item);
        }
    }

    @Test
    public void loadWhitelist(){
        List<ZuulWhiteList> result = zuulWhiteListDao.findAll();
        System.out.println(result);
    }
}
