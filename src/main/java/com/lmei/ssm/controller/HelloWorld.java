package com.lmei.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//@Controller是为了让Spring IOC容器初始化时自动扫描到；
//@RequestMapping是为了映射请求路径
@Controller
@RequestMapping("/Hello")
public class HelloWorld {
    @RequestMapping("/SayHello")   
    public String SayHello(Model model) {    	
        model.addAttribute("message", "Hello Spring MVC!");
        System.out.println(model.containsAttribute("message"));
        return "hello";
    }   
}