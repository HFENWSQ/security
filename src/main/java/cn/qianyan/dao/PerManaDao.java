package cn.qianyan.dao;

import cn.qianyan.beans.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface PerManaDao {

    public int selectAllCount(Map map);//查询数据总条数

    public List<User> selectAll(Map<Object,Object> map);//进入人员管理的初始，按照分页查询
/*
    public List<User> selectLike();//进行人员搜索，模糊查询
*/
    public int addPers(User user);//添加人员

    public int updatePers(User user);//更新人员

    public int deletePers(User user);//删除人员
}
