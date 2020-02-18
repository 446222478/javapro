package com.Neuedu.Test0218.dao;

import com.Neuedu.Test0218.pojo.Student;

import java.util.List;

public interface DaoInterface {
    List<Student> query();
    int add(Student student);
    int update(Student student);
    int del(int Sno);
    Student quaryont(int Sno);
}
