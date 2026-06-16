package com.segovia.tutorials.springboot.a2_sending_data_to_server.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @RequestMapping("/home")
    public String home(@RequestParam String color, Model page) { // Here we added the Request Param which allows us to send some data as a client.
        page.addAttribute("username", "Katy");
        page.addAttribute("color", color);

        return "home.html";
    }
}
