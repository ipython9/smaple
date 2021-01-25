package com.maple.smaple.controller;

import com.maple.smaple.dao.mapper.bo.User;
import com.maple.smaple.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: hanyu
 * @Description:
 * @copyright @hanyu
 * @Date: Create in  2020/2/15 22:02
 */
@Controller
@CrossOrigin
@RequestMapping("/I/LOVE")
public class IndexController {
    @Autowired
    private IUserService iUserService;
    @RequestMapping("/YOU")
    public String list(Model model){
        return  "index";
    }
}
