package com.studentmanager.service;

import com.studentmanager.bean.User;

import java.util.ArrayList;

public interface FileService {
    ArrayList<User> getAllStudent();

    User getFileByNameOrId(String v);

    User getAdmine(String id);

    void del(String stu);

    ArrayList getPersonFile(String studentId);

    void upScore(String stuId, String a, String b, String c);
}
