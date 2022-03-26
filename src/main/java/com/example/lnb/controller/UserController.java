package com.example.lnb.controller;

import com.example.lnb.entity.Result;
import com.example.lnb.entity.User;
import com.example.lnb.mapper.UserMapper;
import com.example.lnb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.thymeleaf.util.StringUtils;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;


@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    UserMapper userMapper;

    @GetMapping("all")
    public List<User> getUser(){
        return userMapper.findAll();
    }

    @RequestMapping("/login")
    public String login(@RequestParam("phone") String phone,
                        @RequestParam("password") String password){
        //具体的业务
        if(!StringUtils.isEmpty(phone) && "123456".equals(password)) {
            return "sucessful";
        }else{
            //告诉用户登录失败
            return "false";
        }
    }


}
