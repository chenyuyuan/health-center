package com.healthcenter;

import com.healthcenter.special.MsgQueue;
import com.healthcenter.special.NewLinkProcessor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.web.bind.annotation.RestController;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

@RestController
@SpringBootApplication
@MapperScan("com.healthcenter.mapper")
public class HealthcenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(HealthcenterApplication.class, args);

    }
}

