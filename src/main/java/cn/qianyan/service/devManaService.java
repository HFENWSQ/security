package cn.qianyan.service;

import cn.qianyan.beans.Device;
import cn.qianyan.beans.User;
import cn.qianyan.utils.pageBean;

import java.util.Map;

public interface devManaService {

    public pageBean selectAllDev(Map<Object,Object> map);//进入人员管理的初始，按照分页查询
    //Equipment
    public int addDev(Device device);//添加人员

    public int updateDev(Device device);//更新人员

    public int deleteDev(Device device);//删除人员
}
