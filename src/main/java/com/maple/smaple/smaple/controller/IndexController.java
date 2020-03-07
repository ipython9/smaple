package com.maple.smaple.smaple.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: hanyu
 * @Description:
 * @copyright @hanyu
 * @Date: Create in  2020/2/15 22:02
 */
@Controller
@RequestMapping("index")
public class IndexController {
    @RequestMapping("login")
    public String Index(){
        return  null;
    }
}
