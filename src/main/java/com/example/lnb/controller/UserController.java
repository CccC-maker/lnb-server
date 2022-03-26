package com.example.lnb.controller;

import com.example.lnb.entity.Users;
import com.example.lnb.entity.dto.Result;
import com.example.lnb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {

    @Autowired
    private UserService userService;


    /**
     * 注册
     * @param users
     * @return
     */
    @PostMapping("/register")
    public Result register(@RequestBody Users users){
        return userService.register(users);
    }

    /**
     * 登录
     * @param users
     * @return
     */
    @PostMapping("/login")
    public Result login(@RequestBody Users users){
        return userService.login(users);
    }

}
