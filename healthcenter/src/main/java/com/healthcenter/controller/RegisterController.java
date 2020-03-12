package com.healthcenter.controller;

//import com.example.humanhealthmonitor.pojo.*;

import com.healthcenter.service.ObjectService;
import com.healthcenter.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Controller
public class RegisterController {
    @Autowired
    private UserService userService;
    @Autowired
    private ObjectService objectService;

    /**
     * 用户注册页面
     */
    @RequestMapping("/register")
    public String register(HttpServletRequest request) {
//        String userId = request.getParameter();
//        User user = new User();
//        user.setUserId(userId);
//        userService.insertUser(user);
        return "register";
    }

    /**
     * 用户提交注册信息
     */



}
