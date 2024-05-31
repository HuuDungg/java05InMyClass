package com.example.lab01.lab04.service;

import com.example.lab01.lab04.model.Employee;
import org.springframework.data.domain.Page;

import java.util.List;

public interface IEmployee {
    Page<Employee> getAll(int page);
    void saveEmployee(Employee employee);
    void deleteEmployeeById(Long employeeId);
    Employee getEmployeeById(Long employeeId);
}
