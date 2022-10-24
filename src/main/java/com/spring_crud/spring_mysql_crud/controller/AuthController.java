package com.spring_crud.spring_mysql_crud.controller;

import com.spring_crud.spring_mysql_crud.entity.User;
import com.spring_crud.spring_mysql_crud.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class AuthController {
    @Autowired
    private AuthService authService;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView viewLogin() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("login.html");
        return modelAndView;
    }

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public ModelAndView viewRegister() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("register.html");
        return modelAndView;
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String userRegister(@RequestBody User user, BindingResult bindingResult, ModelMap modelMap){
        ModelAndView modelAndView = new ModelAndView();
        System.out.println(user);
        authService.save(user);
//        if(bindingResult.hasErrors()){
//            modelAndView.addObject("successMessage", "Please add correct details!");
//            modelMap.addAttribute("bindingResult", bindingResult);
//        }else if(au.isUserPresent(user)){
//            modelAndView.addObject("successMessage", "User already exists!");
//        }else {
//            userService.saveUser(user);
//            modelAndView.addObject("successMessage", "User registered successfully!");
//        }
        return "User has registered";

    }
}
