package cn.qianyan.dao;

import cn.qianyan.beans.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserDao {
    //根据姓名查找用户
    public User selectUserByName(User user);
    //批量删除用户
    public int deleteUserByList(List list);
    //修改用户
    public int updateUserById(User user);
    //添加用户
    public int insertUser(User user);
}
