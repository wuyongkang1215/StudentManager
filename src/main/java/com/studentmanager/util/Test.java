package com.studentmanager.util;

import com.studentmanager.bean.User;
import com.studentmanager.dao.LoginDaoImpl;

public class Test {
    public static void main(String[] args) {
        int id=1001;
        String pwd="1";
        User u = new User();
        u.setU_id(id);
        u.setU_pwd(pwd);
        LoginDaoImpl l = new LoginDaoImpl();
        User retUse=l.logindao(u);
        if(retUse!=null){
            System.out.println(retUse.toString());
            System.out.println("账号和密码一致");
        }else{
            System.out.println("账号和密码不一致");
        }
    }
}
