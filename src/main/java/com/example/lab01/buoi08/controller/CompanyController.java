package com.example.lab01.buoi08.controller;

import com.example.lab01.buoi08.entity.AnotherCompany;
import com.example.lab01.buoi08.entity.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CompanyController {
    @Autowired
    Company company;

    @Autowired
    AnotherCompany anotherCompany;
    @ResponseBody
    @GetMapping("/getName")
    public String getName(){
        return company.getName();
    }

    @ResponseBody
    @GetMapping("/getAnotherName")
    public String getAnotherName(){
        return anotherCompany.getName();
    }
}
