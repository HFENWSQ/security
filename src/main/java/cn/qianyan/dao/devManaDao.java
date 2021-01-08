package cn.qianyan.dao;

import cn.qianyan.beans.Device;
import cn.qianyan.beans.User;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface devManaDao {

    public int selectAllCount(Map map);//查询数据总条数

    public List<User> selectAllDev(Map<Object,Object> map);//进入人员管理的初始，按照分页查询

    public int addDev(Device device);//添加设备

    public int updateDev(Device device);//更新设备

    public int deleteDev(Device device);//删除设备
}
