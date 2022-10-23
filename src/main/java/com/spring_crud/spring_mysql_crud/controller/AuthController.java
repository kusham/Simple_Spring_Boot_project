package com.spring_crud.spring_mysql_crud.controller;

import com.spring_crud.spring_mysql_crud.entity.User;
import com.spring_crud.spring_mysql_crud.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class AuthController {
    @Autowired
    private AuthService authService;

    @RequestMapping("/login")
    public ModelAndView viewLogin() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("login.html");
        return modelAndView;
    }

    @RequestMapping("/register")
    public ModelAndView viewRegister() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("register.html");
        return modelAndView;
    }

    @RequestMapping(value = "/userRegister", method = RequestMethod.POST)
    public String userRegister(@ModelAttribute("user") User user) {
        authService.save(user);
        return "login.html";
    }
}
