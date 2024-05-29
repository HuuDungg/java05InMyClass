package com.example.lab01.buoi56.controller;

import com.example.lab01.buoi56.entity.Country;
import com.example.lab01.buoi56.entity.Staff;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/staff")
public class StaffController {
    @GetMapping("/showForm")
    public String showForm(Model model){
        model.addAttribute("staff", new Staff());
        return "staff/staff";
    }

    @ModelAttribute("positions")
    public Map<String, String> getPosotion(){
        Map<String, String> map = new HashMap<>();
        map.put("sv", "Sinh Vien");
        map.put("ca", "Cong an");
        map.put("gd", "Giam doc");

        return map;
    }

    @ModelAttribute("hobbies")
    public String[] getHobby(){
        String[] list = {"an", "ngu", "choi"};
        return list;
    }

    @ModelAttribute("countries")
    public List<Country>  getCountry(){
        List<Country> list = new ArrayList<>();
        list.add(new Country("1", "viet nam"));
        list.add(new Country("2", "an nam"));
        list.add(new Country("3", "viet my"));
        return list;
    }

    @PostMapping("/form")
    public String save(Model model,@Valid @ModelAttribute("staff") Staff staff, BindingResult result){
        if (result.hasErrors()){
            model.addAttribute("message", result.getAllErrors());
            return "staff/staff";
        }
        model.addAttribute("message", "luu thanh cong");
        return "staff/staff";
    }
}
