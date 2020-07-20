package com.maple.smaple.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: hanyu
 * @Description:
 * @copyright @hanyu
 * @Date: Create in  2020/3/31 15:24
 */
@Controller
@CrossOrigin
@RequestMapping("freemarker")
public class IndexFreeMakerController {
    private final static Logger log = LoggerFactory.getLogger(IndexFreeMakerController.class);
    @RequestMapping("/index")
    public String index(Model model){
        model.addAttribute("name","1231");
        return "indexfreemarker";
    }
}
