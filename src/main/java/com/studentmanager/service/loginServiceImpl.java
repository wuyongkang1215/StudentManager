package com.studentmanager.service;

import com.studentmanager.bean.User;
import com.studentmanager.dao.LoginDao;
import com.studentmanager.dao.LoginDaoImpl;

public class loginServiceImpl implements loginService{
    @Override
    public User loginService(User u) {
        LoginDao ld = new LoginDaoImpl();
        return ld.logindao(u);
    }
}
