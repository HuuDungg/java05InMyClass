package com.example.lab01.lab03.controller;

import com.example.lab01.lab03.entity.Teacher;
import com.example.lab01.lab03.service.TeacherService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/teacher")
public class TeacherController {
    private final TeacherService teacherService = new TeacherService();

    @GetMapping("")
    public String listTeacher(Model model) {
        model.addAttribute("list", teacherService.getAll());
        return "teacher/index";
    }

    @GetMapping("/form")
    public String openForm(Model model) {
        model.addAttribute("teacher", new Teacher());
        return "teacher/form";
    }

    @GetMapping("/detail")
    public String openDetail(@RequestParam("id") String id, Model model) {
        model.addAttribute("teacherDetail", teacherService.findById(id));
        return "teacher/detail";
    }

    @PostMapping("/save")
    public String saveTeacher(@Valid Teacher teacher, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "teacher/form";
        }
        teacherService.create(teacher);
        return "redirect:/teacher";
    }

    @GetMapping("/updateForm")
    public String openFormUpdate(@RequestParam("id") String id, Model model) {
        model.addAttribute("teacher", teacherService.findById(id));
        return "teacher/update";
    }

    @PostMapping("/update")
    public String saveUpdate(@Valid Teacher teacher, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "teacher/update";
        }
        teacherService.update(teacher);
        return "redirect:/teacher";
    }

    @GetMapping("/delete")
    public String deleteTeacher(@RequestParam("id") String id) {
        teacherService.delete(id);
        return "redirect:/teacher";
    }

    @PostMapping("/search")
    public String searchTeacher(@RequestParam("nameSearch") String teacherName ,Model model){
        model.addAttribute("list", teacherService.getTeacherByName(teacherName));
        return "teacher/index";
    }

    @GetMapping("/female")
    public String femaleTeacher(Model model){
        model.addAttribute("list",teacherService.getAllFemaleTeachers());
        return "teacher/index";
    }
}
