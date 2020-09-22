package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

    @GetMapping("/")
        public String welcome() {
            return ("index");
        }

    @GetMapping("/demo")
    public String demo(){
        return "demo";
    }


}
