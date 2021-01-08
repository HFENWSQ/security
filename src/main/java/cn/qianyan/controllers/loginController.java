package cn.qianyan.controllers;

import cn.qianyan.beans.User;
import cn.qianyan.service.loginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Controller
@ResponseBody
@RequestMapping("login")
public class loginController {

    @Autowired
    private loginService loginService;
    @RequestMapping("into")
    public Map into(HttpServletRequest request,
                    @RequestParam("uname") String uname,
                    @RequestParam("upassword") String upassword){
        User user = new User();
        Map<Object, Object> map = new HashMap<>();
        user.setUname(uname);
        user.setUpassword(upassword);
        User login = loginService.login(user);
        if (login!=null){
            HttpSession session = request.getSession();
            session.setAttribute("user",login);
            map.put("code",0);
            map.put("uname",login.getUname());
            map.put("uright",login.getUright());
        }else {
            map.put("code",10001);
        }
        return map;

    }
    @RequestMapping("changePassword")
    public Map changePassword(HttpServletRequest request,
                              @RequestParam("uname") String uname,
                              @RequestParam("old_upassword") String old_upassword,
                              @RequestParam("new_upassword") String new_upassword){
        Map<Object, Object> map = new HashMap<>();
        User user = new User();
        user.setUname(uname);
        user.setUpassword(old_upassword);
        User login = loginService.login(user);
        if (login!=null){
            user.setUid(login.getUid());
            user.setUpassword(new_upassword);
            int i = loginService.updatePassword(user);
            if (i>0){
                map.put("code",0);
            }else {
                map.put("code",10002);
            }
        }else {
            map.put("code",10002);
        }
        return map;
    }
    @RequestMapping("register")
    public Map register(HttpServletRequest request,
                        @RequestParam("uname") String uname,
                        @RequestParam("upassword") String upassword,
                        @RequestParam("utelephone") String utelephone){
        Map<Object, Object> map = new HashMap<>();
        User user = new User();
        String s = UUID.randomUUID().toString();
        user.setUid(s);
        user.setUname(uname);
        user.setUpassword(upassword);
        user.setUtelephone(utelephone);
        int register = loginService.register(user);
        if (register>0){
            map.put("code",0);
        }else {
            map.put("code",10003);
        }
        return map;
    }
}
