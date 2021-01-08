package cn.qianyan.controllers;

import cn.qianyan.beans.Device;
import cn.qianyan.beans.User;
import cn.qianyan.service.devManaService;
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
@RequestMapping("devMana")
public class devManaController {

    @Autowired
    private devManaService devManaService;

    @RequestMapping("selectAllDev")
    public Map selectAllDev(@RequestParam("Page_number") int Page_number){
        Map<Object, Object> map = new HashMap<>();
        Map<Object, Object> inMap = new HashMap<>();
        inMap.put("Page_number",Page_number);
        pageBean pageBean = devManaService.selectAllDev(inMap);
        if (pageBean!=null){
            map.put("code",0);
            map.put("data",pageBean);
        }else {
            map.put("code",10018);
        }
        return map;
    }
    @RequestMapping("selectLileDev")
    public Map selectLike(@RequestParam("Page_number") int Page_number,
                          @RequestParam("search_info") String search_info){
        Map<Object, Object> map = new HashMap<>();
        Map<Object, Object> inMap = new HashMap<>();
        inMap.put("Page_number",Page_number);
        inMap.put("search_info",search_info);
        pageBean pageBean = devManaService.selectAllDev(inMap);
        if (pageBean!=null){
            map.put("code",0);
            map.put("data",pageBean);
        }else {
            map.put("code",10019);
        }
        return map;
    }
    @RequestMapping("addDev")
    public Map addDev(@RequestParam("dname") String dname,
                       @RequestParam("dstate") int dstate,
                       @RequestParam("dtid") String dtid){
        Map<Object, Object> map = new HashMap<>();
        Device device = new Device();
        String s = UUID.randomUUID().toString();
        device.setDid(s);
        device.setDname(dname);
        device.setDstate(dstate);
        device.setDtid(dtid);
        int i = devManaService.addDev(device);
        if (i>0){
            map.put("code",0);
        }else {
            map.put("code",10020);
        }
        return map;
    }
    @RequestMapping("updateDev")
    public Map updatePers(@RequestParam("dname") String dname,
                          @RequestParam("dstate") int dstate,
                          @RequestParam("dtid") String dtid,
                          @RequestParam("did") String did){
        Map<Object, Object> map = new HashMap<>();
        Device device = new Device();
        device.setDid(did);
        device.setDname(dname);
        device.setDstate(dstate);
        device.setDtid(dtid);
        int i = devManaService.updateDev(device);
        if (i>0){
            map.put("code",0);
        }else {
            map.put("code",10021);
        }
        return map;
    }
    @RequestMapping("deleteDev")
    public Map deletePers(@RequestParam("did") String did){
        Map<Object, Object> map = new HashMap<>();
        Device device = new Device();
        device.setDid(did);
        int i = devManaService.deleteDev(device);
        if (i>0){
            map.put("code",0);
        }else {
            map.put("code",10022);
        }
        return map;
    }
}
