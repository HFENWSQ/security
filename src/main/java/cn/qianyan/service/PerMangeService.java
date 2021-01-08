package cn.qianyan.service;

import cn.qianyan.beans.User;
import cn.qianyan.utils.pageBean;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface PerMangeService {

    public pageBean selectAll(Map<Object,Object> map);//进入人员管理的初始，按照分页查询
/*
    public List<User> selectLike();//进行人员搜索，模糊查询
*/
    public int addPers(User user);//添加人员

    public int updatePers(User user);//更新人员

    public int deletePers(User user);//删除人员
}
