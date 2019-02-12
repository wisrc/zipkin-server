package com.wisrc.microservice.dao.cassandra;

import com.wisrc.microservice.entity.DemoEmp;
import org.springframework.data.cassandra.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DemoDao extends CrudRepository<DemoEmp, String> {

    @Query(value = "select * from Emp")
    List<DemoEmp> findAll();
}
