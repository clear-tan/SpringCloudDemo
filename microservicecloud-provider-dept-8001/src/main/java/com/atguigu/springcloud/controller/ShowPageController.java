package com.atguigu.springcloud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShowPageController {
	
	@RequestMapping(value = "/page")
    public String show(){
        System.out.println("进入show页面");
        return "show";
    }

}
