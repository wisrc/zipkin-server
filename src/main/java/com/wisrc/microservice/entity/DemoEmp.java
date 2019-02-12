package com.wisrc.microservice.entity;

import lombok.Data;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Data
@Table(value = "emp")
public class DemoEmp {

    @PrimaryKey
    @Column(value = "emp_id")
    private String empId;

    @Column(value = "emp_name")
    private String empName;

    @Column(value = "emp_city")
    private String empCity;

    @Column(value = "emp_phone")
    private String empPhone;

    @Column(value = "emp_sal")
    private String empSal;
}
