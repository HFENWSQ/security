package cn.qianyan.service;

import cn.qianyan.beans.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    //根据姓名查找用户
    public User selectUserByName(User user);
    //批量删除用户
    public int deleteUserByList(List list);
    //修改用户
    public int updateUserById(User user);
    //添加用户
    public int insertUser(User user);
}
