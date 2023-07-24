package com.example.vaccination_project.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.vaccination_project.Model.User;
import com.example.vaccination_project.Service.vaccination_projectService;

@Controller
public class vaccination_projectController {
    @Autowired
    vaccination_projectService demo;

    @GetMapping("/")
    public String home(Model model) {
         List<User> us = demo.show();
         model.addAttribute("data", us);
        return "index";
    }

     //Add user (vaccine form)
    @GetMapping("/form")
    public String vaccineForm(Model model, User us){
        model.addAttribute("data", us);
        return "vaccinForm";
    }

    @PostMapping("/form")
    public String List(@ModelAttribute User user, Model model) {
        demo.Add(user);
        return "redirect:/"; // file name
    }

}
