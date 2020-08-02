package com.kryptovos;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BasicController {

    @RequestMapping("/home")
    public String showHomePage() {
        return "home-page";
    }

    @RequestMapping("/showForm")
    public String showForm() {
        return "show-form";
    }

    @RequestMapping("/processForm")
    public String processForm() {
        return "process-form";
    }
}
