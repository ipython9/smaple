package com.maple.smaple.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: hanyu
 * @Description:
 * @copyright @hanyu
 * @Date: Create in  2020/3/31 15:03
 */
@EnableAutoConfiguration
@RestController()
@RequestMapping("/main")
public class MainTest {
    @RequestMapping("/index")
    public String index(){
        return "success";
    }
    public static void main(String[]args){
        SpringApplication.run(MainTest.class,args);
    }
}
