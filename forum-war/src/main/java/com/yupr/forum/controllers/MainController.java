package com.yupr.forum.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Yura on 18.03.2017.
 */
@Controller
public class MainController {

    @GetMapping("/hello")
    @ResponseBody
    public String hello(){
        return "Hello from first Spring servlet!";
    }
}
