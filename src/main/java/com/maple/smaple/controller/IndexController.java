package com.maple.smaple.controller;

import com.maple.smaple.dao.mapper.bo.User;
import com.maple.smaple.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
@RequestMapping("index")
public class IndexController {
    @Autowired
    private IUserService iUserService;

    @RequestMapping("hello")
    @ResponseBody
    public String index(){
        return  iUserService.findUserById(1).getUsername();
    }

    @RequestMapping("selectList")
    @ResponseBody
    public List<User> selectList(){
        User user = new User();
        List<String> userNames = new ArrayList<>();
        userNames.add("2");
        userNames.add("3");
        userNames.add("4");
        user.setUserNames(userNames);
        return iUserService.selectList(user);

    }
    @RequestMapping("/list")
    public String list(Model model){
        User user = new User();
        List<String> userNames = new ArrayList<>();
        userNames.add("2");
        userNames.add("3");
        userNames.add("4");
        user.setUserNames(userNames);
        List<User> users = iUserService.selectList(user);
        model.addAttribute("userList",users);
        return  "index";
    }
}
