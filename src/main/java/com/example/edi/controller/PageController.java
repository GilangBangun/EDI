package com.example.edi.controller;

import java.util.Optional;

// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.security.core.Authentication;
import org.springframework.ui.Model;

import com.example.edi.model.UserModel;
import com.example.edi.service.UserService;

@Controller
public class PageController {
    
    private UserService userService;

    @RequestMapping("/")
    public String home(Model model){
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        UserModel user = (UserModel) auth.getPrincipal();
        String username = user.getName();
        Optional<UserModel> userModel = userService.findUserByName(username);
        model.addAttribute("user", userModel);
        return "home";
    }

    @RequestMapping("/login")
    public String login(){
        return "login";
    }
}
