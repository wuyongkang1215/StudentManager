package com.studentmanager.bean;

public class User {
    private int u_id;
    private String u_name;
    private String u_pwd;
    private String u_phone;
    private int role;
    private int isdelete;
    public User(){}

    public User(int u_id,String u_name, String u_pwd, String u_phone, int role, int isdelete) {
        this.u_id = u_id;
        this.u_name= u_name;
        this.u_pwd = u_pwd;
        this.u_phone = u_phone;
        this.role = role;
        this.isdelete = isdelete;
    }

    public String getU_name() {
        return u_name;
    }

    public void setU_name(String u_name) {
        this.u_name = u_name;
    }

    public int getU_id() {
        return u_id;
    }

    public void setU_id(int u_id) {
        this.u_id = u_id;
    }

    public String getU_pwd() {
        return u_pwd;
    }

    public void setU_pwd(String u_pwd) {
        this.u_pwd = u_pwd;
    }

    public String getU_phone() {
        return u_phone;
    }

    public void setU_phone(String u_phone) {
        this.u_phone = u_phone;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public int getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(int isdelete) {
        this.isdelete = isdelete;
    }

    @Override
    public String toString() {
        return "User{" +
                "u_id=" + u_id +
                ", u_name='" + u_name + '\'' +
                ", u_pwd='" + u_pwd + '\'' +
                ", u_phone='" + u_phone + '\'' +
                ", role=" + role +
                ", isdelete=" + isdelete +
                '}';
    }
}
