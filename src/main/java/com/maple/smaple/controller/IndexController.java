package com.maple.smaple.controller;

import com.maple.smaple.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: hanyu
 * @Description:
 * @copyright @hanyu
 * @Date: Create in  2020/2/15 22:02
 */
@Controller
@RequestMapping("index")
public class IndexController {
    @Autowired
    private IUserService iUserService;

    @RequestMapping("hello")
    @ResponseBody
    public String Index(){
        return  iUserService.findUserById(1).getUsername();
    }
}
