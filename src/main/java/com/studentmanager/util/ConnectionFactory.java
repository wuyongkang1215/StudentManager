package com.studentmanager.util;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionFactory {
    private  static DataSource dataSource=new ComboPooledDataSource();

    public  static Connection getConnection(){
        try {
            return dataSource.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public static  void close(Connection connection, PreparedStatement preparedStatement, ResultSet resultSet){
        try {
            if(resultSet!=null) resultSet.close();
            if(preparedStatement!=null) preparedStatement.close();
            if (connection!=null) connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
