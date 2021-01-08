package cn.qianyan.service.Impl;

import cn.qianyan.beans.User;
import cn.qianyan.dao.UserDao;
import cn.qianyan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public User selectUserByName(User user) {
        User user1 = userDao.selectUserByName(user);
        return user1;
    }

    @Override
    public int deleteUserByList(List list) {
        int i = userDao.deleteUserByList(list);
        return i;
    }

    @Override
    public int updateUserById(User user) {
        int i = userDao.updateUserById(user);
        return i;
    }

    @Override
    public int insertUser(User user) {
        int i = userDao.insertUser(user);
        return i;
    }

}
