package com.tasting_club.springboot_101.controller;

import com.tasting_club.springboot_101.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;

@Controller
public class HomeController {

    /*@RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "home/index";
    }*/

    @GetMapping("/")
    public String index() {
        return "home/index";
    }

   /* @PostMapping("/personData")
    public String personData(WebRequest wr, Model model) {

        String firstName = wr.getParameter("fname");
        String lastName = wr.getParameter("lname");

        model.addAttribute("first_name", firstName);
        model.addAttribute("last_name", lastName);

        return "home/personData";
    }*/

    @PostMapping("/personData")
    public String personData(@ModelAttribute Person person, Model model) {

        model.addAttribute("Person", person);

        return "home/personData";
    }


}
