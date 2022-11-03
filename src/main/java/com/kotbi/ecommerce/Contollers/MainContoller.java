package com.kotbi.ecommerce.Contollers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainContoller {

    @GetMapping("")
    public String Index(){
        return "index";
    }
}
