package com.studentmanager.service;

import com.studentmanager.bean.User;
import com.studentmanager.dao.FileDao;
import com.studentmanager.dao.FileDaoImpl;

import java.util.ArrayList;

public class FileServiceImpl implements FileService{
    FileDao fs =new FileDaoImpl();
    @Override
    public ArrayList<User> getAllStudent() {
        return fs.getAllStudent();
    }

    @Override
    public User getFileByNameOrId(String v) {
        return fs.getFileByNameOrId(v);
    }

    @Override
    public User getAdmine(String id) {
        return fs.getAdmine(id);
    }

    @Override
    public void del(String stu) {
        fs.del(stu);
    }

    @Override
    public ArrayList getPersonFile(String studentId) {
        return fs.getPersonFile(studentId);

    }

    @Override
    public void upScore(String stuId, String a, String b, String c) {
        fs.upScore(stuId,a,b,c);
    }


}
