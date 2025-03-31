package com.fullstack.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
public class Employee {

    @Id
    private int empId;

    private String empName;

    private String empAddress;

    private double empSalary;

    private long empContactNumber;

    private String empEmailId;

    private String empPassword;
}
