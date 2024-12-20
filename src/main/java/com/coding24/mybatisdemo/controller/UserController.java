package com.coding24.mybatisdemo.controller;

import com.coding24.mybatisdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/findById/{id}")
    public String findById(@PathVariable("id") Integer id, Model model){
        model.addAttribute("user",userService.findById(id));
        return "show";
    }
}
