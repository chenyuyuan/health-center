package com.healthcenter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelpController {
    /**
     * 用户帮助页面
     */
//    @Autowired
//    private LoginController loginController;

    @RequestMapping("/help")
    public String help(HttpServletRequest request) {
//        String userId = request.getParameter();
//        User user = new User();
//        user.setUserId(userId);
//        userService.insertUser(user);
//        LoginController loginController = new LoginController();
//        loginController.Testttt();
        return "help";
    }
}
