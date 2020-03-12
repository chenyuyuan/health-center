package com.healthcenter.controller;

import com.healthcenter.pojo.*;
import com.healthcenter.pojo.Object;
import com.healthcenter.service.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

@Controller
public class LoginController {
    @Autowired
    private UserService userService;
    @Autowired
    private UserLogService userLogService;
    @Autowired
    private AdminService adminService;
    @Autowired
    private AdminLogService adminLogService;
    @Autowired
    private ObjectService objectService;
    @Autowired
    private ObjectLogService objectLogService;
    @Autowired
    private MainPicService mainPicService;
    @Autowired
    private NewsService newsService;
    //    @Autowired
    //    private EquipmentService equipmentService;
    @Autowired
    private AlarmLogService alarmLogService;
    @Autowired
    private ObjectResouceUseService objectResouceUseService;

    //    CloudMsgUtil cloudMsgUtil;
    //    CloudMsgUtil cloudMsgUtil = new CloudMsgUtil();
    //    DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
    //            TimeZone.getTimeZone("GMT+08:00")
    SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    //    format.setTimeZone(TimeZone.getTimeZone("Asia/Shanghai"));
    @RequestMapping("/login")
    public String login(HttpServletRequest request) throws InterruptedException {
        //先清除原来的session
        HttpSession session = request.getSession();

        return "login";
    }



}
