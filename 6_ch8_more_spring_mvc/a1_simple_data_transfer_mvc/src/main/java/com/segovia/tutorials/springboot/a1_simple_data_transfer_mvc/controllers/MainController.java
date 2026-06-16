package com.segovia.tutorials.springboot.a1_simple_data_transfer_mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("/home")
    public String home(Model page) { // gives us access to the page metadata
        page.addAttribute("username", "Katy"); // Adds metadata to the template html that we can use to dynamically display data
        page.addAttribute("color", "red");

        return "home.html";
    }
}
