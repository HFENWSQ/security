package cn.qianyan.dao;

import cn.qianyan.beans.User;
import org.springframework.stereotype.Repository;

@Repository
public interface loginDao {

    //登陆
    public User login(User user);
    //注册
    public int register(User user);
    //修改密码
    public int updatePassword(User user);
}
