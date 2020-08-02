package com.kryptovos;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpServletRequest;

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

    @RequestMapping("/processFormV2")
    public String letsShoutDude(HttpServletRequest request, Model model){

        // Read the request paramater from the HTML form
        String theName = request.getParameter("studentName");

        // Convert the data to all caps
        theName = theName.toUpperCase();

        // Create result
        String result = "Yo! WADDUP " + theName;

        // Add message to the model
        model.addAttribute("message", result);

        return "shout-page";
    }
}
