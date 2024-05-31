package com.example.lab01.lab04.controller;

import com.example.lab01.lab04.model.Employee;
import com.example.lab01.lab04.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/lab04")
@RequiredArgsConstructor
public class EmployeeController {
    private final EmployeeService employeeService;

    @GetMapping("/list")
    public String listEmployee(Model model,
                               @RequestParam(name = "page", defaultValue = "0")int page
    ){
        model.addAttribute("page", employeeService.getAll(page));
        return "lab04/index";
    }

    @PostMapping("/add")
    public String saveEmployee(Employee employee){
        employeeService.saveEmployee(employee);
        return "redirect:/lab04/list";
    }

    @GetMapping("/delete/{employeeId}")
    public String deleteEmployee(@PathVariable("employeeId") Long employeeId){
        employeeService.deleteEmployeeById(employeeId);
        return "redirect:/lab04/list";
    }

    @GetMapping("/detail/{employeeId}")
    public String openDetail(@PathVariable("employeeId") Long employeeId ,Model model){
        model.addAttribute("employee", employeeService.getEmployeeById(employeeId));
        return "lab04/Detail";
    }

    @PostMapping("/update")
    public String updateEmployee(@ModelAttribute("employee") Employee employee){
        employeeService.saveEmployee(employee);
        return "redirect:/lab04/list";
    }

}
