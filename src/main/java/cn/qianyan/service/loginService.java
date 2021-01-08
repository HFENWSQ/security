package cn.qianyan.service;

import cn.qianyan.beans.User;
import org.springframework.stereotype.Service;

@Service
public interface loginService {
    //登陆
    public User login(User user);
    //注册
    public int register(User user);
    //修改密码
    public int updatePassword(User user);
}
