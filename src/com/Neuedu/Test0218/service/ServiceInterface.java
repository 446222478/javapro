package com.Neuedu.Test0218.service;

import com.Neuedu.Test0218.pojo.Student;

import java.util.List;

public interface ServiceInterface {
    List<Student> query();
    int add(Student student);
    int update(Student student);
    int del(int Sno);
    Student quaryont(int Sno);
}
