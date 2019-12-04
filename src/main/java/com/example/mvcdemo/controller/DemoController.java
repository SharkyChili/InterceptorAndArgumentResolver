package com.example.mvcdemo.controller;

import com.example.mvcdemo.Entity;
import com.example.mvcdemo.annotation.Login;
import com.example.mvcdemo.annotation.LoginUser;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @Login
    @RequestMapping("/method")
    public Entity method(@LoginUser Entity entity){
        return entity;
    }
}
