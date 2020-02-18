package com.Neuedu.Test0218.service;

import com.Neuedu.Test0218.dao.DaoInterface;
import com.Neuedu.Test0218.dao.StudentDao;
import com.Neuedu.Test0218.pojo.Student;

import java.util.List;

public class StudentService implements ServiceInterface{

    DaoInterface daoInterface = new StudentDao();

    @Override
    public List<Student> query() {
        return daoInterface.query();
    }

    @Override
    public int add(Student student) {
        return daoInterface.add(student);
    }

    @Override
    public int update(Student student) {
        return daoInterface.update(student);
    }

    @Override
    public int del(int Sno) {
        return daoInterface.del(Sno);
    }

    @Override
    public Student quaryont(int Sno) {
        return null;
    }
}
