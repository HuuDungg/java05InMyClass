package com.example.lab01.buoi08.controller;

import com.example.lab01.buoi08.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeeController
{
    @Autowired
    EmployeeService employeeService;

    @RequestMapping("/get-list")
    public String getListNha(Model model){
        model.addAttribute("list", employeeService.getAll());
        return "employee/table";
    }
}
