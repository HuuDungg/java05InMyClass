package com.example.lab01.buoi08.service;

import com.example.lab01.buoi08.entity.Employee;
import org.springframework.stereotype.Service;


import java.util.Arrays;
import java.util.List;

@Service
public class EmployeeService
{
    private List<Employee> List =  Arrays.asList(new Employee("tran van a"),
            new Employee("tran van b")
            );

    public List<Employee> getAll(){
        return  List;
    }
}
