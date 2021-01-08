package cn.qianyan.controllers;

import cn.qianyan.beans.User;
import cn.qianyan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private User user;
    @Autowired
    private UserService userService;

    @RequestMapping("selectUserByName")
    public String selectUserByName(Model model, @RequestParam("uname") String uname){
        user.setUname(uname);
        User user = userService.selectUserByName(this.user);
        model.addAttribute("user",user);
        return "hello";
    }

}
