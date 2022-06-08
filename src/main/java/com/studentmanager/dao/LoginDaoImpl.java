package com.studentmanager.dao;

import com.studentmanager.bean.User;
import com.studentmanager.util.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDaoImpl implements LoginDao{
    @Override
    public User logindao(User u) {
        int id = u.getU_id();
        String pwd=u.getU_pwd();
        //        数据库的东西
        Connection connection= ConnectionFactory.getConnection();
        PreparedStatement pre = null;
        ResultSet res = null;
        //        准备sql语句
        String sql ="SELECT * FROM user WHERE u_id="+id+" AND u_pwd='"+pwd+"'";
        try {
            pre = connection.prepareStatement(sql);
            res = pre.executeQuery();
            while (res.next()){
                User user = new User();
                user.setU_id(res.getInt("u_id"));
                user.setU_name(res.getString("u_name"));
                user.setU_pwd(res.getString("u_pwd"));
                user.setU_phone(res.getString("u_phone"));
                user.setRole(res.getInt("u_role"));
                user.setIsdelete(res.getInt("u_delete"));
                return user;
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }
        return  null;
    }
}
