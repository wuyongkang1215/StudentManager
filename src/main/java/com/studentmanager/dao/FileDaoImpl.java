package com.studentmanager.dao;

import com.studentmanager.bean.Major;
import com.studentmanager.bean.User;
import com.studentmanager.util.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class FileDaoImpl implements FileDao{
    @Override
    public ArrayList<User> getAllStudent() {
        ArrayList<User> arr = new ArrayList<>();
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement pre = null;
        ResultSet res = null;
        //        准备sql语句
        String sql = "SELECT * FROM user WHERE u_role=1 AND u_delete=0";
        try {
            pre = connection.prepareStatement(sql);
            res = pre.executeQuery();
            while (res.next()) {
                User user = new User();
                user.setU_id(res.getInt("u_id"));
                user.setU_name(res.getString("u_name"));
                user.setU_pwd(res.getString("u_pwd"));
                user.setU_phone(res.getString("u_phone"));
                user.setRole(res.getInt("u_role"));
                user.setIsdelete(res.getInt("u_delete"));
                arr.add(user);
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }
        return arr;
    }

    @Override
    public User getFileByNameOrId(String v) {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement pre = null;
        ResultSet res = null;
        //        准备sql语句
        String sql = "SELECT *FROM user WHERE u_name='"+v+"'";
        try {
            pre = connection.prepareStatement(sql);
            res = pre.executeQuery();
            while (res.next()) {
                User user2 = new User();
                user2.setU_id(res.getInt("u_id"));
                user2.setU_name(res.getString("u_name"));
                user2.setU_pwd(res.getString("u_pwd"));
                user2.setU_phone(res.getString("u_phone"));
                user2.setRole(res.getInt("u_role"));
                user2.setIsdelete(res.getInt("u_delete"));
                return user2;
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public User getAdmine(String id) {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement pre = null;
        ResultSet res = null;
        //        准备sql语句
        String sql = "SELECT *FROM user WHERE u_id='"+id+"'";
        try {
            pre = connection.prepareStatement(sql);
            res = pre.executeQuery();
            while (res.next()) {
                User user2 = new User();
                user2.setU_id(res.getInt("u_id"));
                user2.setU_name(res.getString("u_name"));
                return user2;
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void del(String stu) {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement pre = null;
        ResultSet res = null;
        //        准备sql语句
        String sql = "DELETE FROM user WHERE u_id="+stu;
        try {
            pre = connection.prepareStatement(sql);
            pre.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public ArrayList getPersonFile(String studentId) {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement pre = null;
        ResultSet res = null;
        //        准备sql语句
        String sql = "SELECT c_name courseName,c_score score FROM course a,userchoose b WHERE a.c_id=b.c_id AND b.u_id="+studentId;
        ArrayList<Major> arr = new ArrayList<>();

        try {
            pre = connection.prepareStatement(sql);
            res = pre.executeQuery();


            while (res.next()) {
                Major m = new Major();
                m.setA(res.getString("courseName"));
                m.setB(res.getString("score"));
                arr.add(m);

            }


        } catch (SQLException e) {
            e.printStackTrace();
        }
        return arr;
    }

    @Override
    public void upScore(String stuId, String a, String b, String c) {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement pre = null;
        ResultSet res = null;
        String[] file = {a,b,c};
        int index=0;
        try {
            for(int i =1001;i<=1003;i++){
                String sql ="UPDATE userchoose SET c_score = "+file[index]+" WHERE u_id="+stuId+" AND c_id="+i;
                index++;
                pre = connection.prepareStatement(sql);
                pre.executeUpdate();
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }




    }


}
