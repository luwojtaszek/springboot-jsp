package com.luwojtaszek.springbootjsp.web.controller;

import com.luwojtaszek.springbootjsp.web.constant.View;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by lukasz on 27.08.2017.
 * With IntelliJ IDEA 15
 */
@Controller
public class HomeController {

    @GetMapping("/")
    public String getHomePage(Model model) {
        model.addAttribute("message", "Spring Boot application that uses JSP With Embedded Tomcat");
        return View.HOME.getPath();
    }

}
