package cn.qianyan.service.Impl;

import cn.qianyan.beans.User;
import cn.qianyan.dao.loginDao;
import cn.qianyan.service.loginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class loginServiceImpl implements loginService {

    @Autowired
    private loginDao loginDao;
    @Override
    public User login(User user) {
        User login = loginDao.login(user);
        return login;
    }

    @Override
    public int register(User user) {
        int register = loginDao.register(user);
        return register;
    }

    @Override
    public int updatePassword(User user) {
        int i = loginDao.updatePassword(user);
        return i;
    }
}
