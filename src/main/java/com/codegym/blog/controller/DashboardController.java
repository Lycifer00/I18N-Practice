package com.codegym.blog.controller;

import com.codegym.blog.respone.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("user")
public class DashboardController {
    @GetMapping("/dashboard")
    public String login(Model model) {
        User user = new User();
        model.addAttribute("user", user);
        return "dashboard";
    }
}
