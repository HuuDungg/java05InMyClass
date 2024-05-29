package com.example.lab01.buoi04.controller;

import com.example.lab01.buoi04.entity.Student;
import com.example.lab01.buoi04.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/student")
public class StudentController {
    private StudentService studentService = new StudentService();

    @GetMapping("")
    public String listStudent(Model model){
        model.addAttribute("list", studentService.getAll());
        return "student/index";
    }

    @GetMapping("/form")
    public String openForm(){
        return "student/form";
    }

    @PostMapping("/save")
    public String saveStudent(Student student){
        studentService.Create(student);
        return "redirect:/student";
    }

    @GetMapping("/updateForm")
    public String openFormUpdate(@RequestParam("id") String id, Model model){
        model.addAttribute("studentDetail", studentService.findById(id));
        return "student/update";
    }

    @PostMapping("update")
    public String saveUpdate(Student student){
        studentService.update(student);
        return "redirect:/student";
    }

    @GetMapping("/delete")
    public String deleteStudent(@RequestParam("id") String id){
        studentService.delete(id);
        return "redirect:/student";
    }
}
