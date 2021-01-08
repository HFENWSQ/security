package cn.qianyan.controllers;

import cn.qianyan.beans.User;
import cn.qianyan.service.PerMangeService;
import cn.qianyan.utils.pageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * @author:
 * @createDate:
 * @description:
 */
@Controller
@ResponseBody
@RequestMapping("personManage")
public class PerManaController {

    @Autowired
    private PerMangeService perMangeService;

    @RequestMapping("selectAll")
    public Map selectAllPers(@RequestParam("Page_number") int Page_number){
        Map<Object, Object> map = new HashMap<>();
        Map<Object, Object> inMap = new HashMap<>();
        inMap.put("Page_number",Page_number);
        pageBean pageBean = perMangeService.selectAll(inMap);
        if (pageBean!=null){
            map.put("code",0);
            map.put("data",pageBean);
        }else {
            map.put("code",10004);
        }
        return map;
    }
    @RequestMapping("selectLike")
    public Map selectLike(@RequestParam("Page_number") int Page_number,
                          @RequestParam("search_info") String search_info){
        Map<Object, Object> map = new HashMap<>();
        Map<Object, Object> inMap = new HashMap<>();
        inMap.put("Page_number",Page_number);
        inMap.put("search_info",search_info);
        pageBean pageBean = perMangeService.selectAll(inMap);
        if (pageBean!=null){
            map.put("code",0);
            map.put("data",pageBean);
        }else {
            map.put("code",10005);
        }
        return map;
    }
    @RequestMapping("addPers")
    public Map addPers(@RequestParam("uname") String uname,
                       @RequestParam("upassword") String upassword,
                       @RequestParam("uright") int uright){
        Map<Object, Object> map = new HashMap<>();
        User user = new User();
        String s = UUID.randomUUID().toString();
        user.setUid(s);
        user.setUname(uname);
        user.setUpassword(upassword);
        user.setUright(uright);
        int i = perMangeService.addPers(user);
        if (i>0){
            map.put("code",0);
        }else {
            map.put("code",10006);
        }
        return map;
    }
    @RequestMapping("updatePers")
    public Map updatePers(@RequestParam("uname") String uname,
                          @RequestParam("upassword") String upassword,
                          @RequestParam("uright") int uright,
                          @RequestParam("uid") String uid){
        Map<Object, Object> map = new HashMap<>();
        User user = new User();
        user.setUid(uid);
        user.setUname(uname);
        user.setUpassword(upassword);
        user.setUright(uright);
        int i = perMangeService.updatePers(user);
        if (i>0){
            map.put("code",0);
        }else {
            map.put("code",10007);
        }
        return map;
    }
    @RequestMapping("deletePers")
    public Map deletePers(@RequestParam("uid") String uid){
        Map<Object, Object> map = new HashMap<>();
        User user = new User();
        user.setUid(uid);
        int i = perMangeService.deletePers(user);
        if (i>0){
            map.put("code",0);
        }else {
            map.put("code",10008);
        }
        return map;
    }
}
