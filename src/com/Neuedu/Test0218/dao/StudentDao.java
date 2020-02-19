package com.Neuedu.Test0218.dao;

import com.Neuedu.Test0218.pojo.Student;
import com.Neuedu.Test0218.util.JdbcUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDao implements DaoInterface{
    String url = "jdbc:mysql://192.168.168.178/db1?useUnicode=true&characterEncoding=utf8";
    String username = "root";
    String password = "wei8884402000";
    @Override
    public List<Student> query() {
        List<Student> list = new ArrayList<>();
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            //加载驱动
            Class.forName("com.mysql.jdbc.Driver");
            //创建连接
            connection = DriverManager.getConnection(url, username, password);
            //执行命令行，写sql语句
            preparedStatement = connection.prepareStatement("SELECT Sno,Sname,Ssex,Sage,Sdept FROM Student");
            //如果是查询 调用 executeQuery方法 返回一个 ResultSet 结果集
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                Student student = new Student();
                student.setSno(resultSet.getInt("Sno"));
                student.setSname(resultSet.getString("Sname"));
                student.setSsex(resultSet.getString("Ssex"));
                student.setSage(resultSet.getInt("Sage"));
                student.setSdept(resultSet.getNString("Sdept"));
                list.add(student);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (resultSet!=null)
                    resultSet.close();
                if (preparedStatement!=null)
                    preparedStatement.close();
                if (connection!=null)
                    connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
        return list;
    }

    @Override
    public  int add(Student student) {
/*        int i = 0;
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            //加载驱动
            Class.forName("com.mysql.jdbc.Driver");
            //创建连接
            connection = DriverManager.getConnection(url, username, password);
            //执行命令行，写sql语句
            preparedStatement = connection.prepareStatement("insert into Student(Sno,Sname,Ssex,Sage,Sdept) values(?,?,?,?,?)");
            //设置问号的值
            preparedStatement.setInt(1,student.getSno());
            preparedStatement.setString(2,student.getSname());
            preparedStatement.setString(3,student.getSsex());
            preparedStatement.setInt(4,student.getSage());
            preparedStatement.setString(2,student.getSdept());
            i = preparedStatement.executeUpdate();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (preparedStatement!=null)
                    preparedStatement.close();
                if (connection!=null)
                    connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return i;*/
        return JdbcUtil.executeUpdate("insert into Student(Sname,Ssex,Sage,Sdept) values(?,?,?,?,?)",student.getSname(),student.getSsex(),student.getSage(),student.getSdept());
    }

    @Override
    public int update(Student student) {
/*        int i = 0;
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            //加载驱动
            Class.forName("com.mysql.jdbc.Driver");
            //创建连接
            connection = DriverManager.getConnection(url, username, password);
            //执行命令行，写sql语句
            preparedStatement = connection.prepareStatement("update Student set Sname=?,Ssex=?,Sage=?,Sdept=? where Sno=?");
            //设置问号的值
            preparedStatement.setInt(1,student.getSno());
            preparedStatement.setString(2,student.getSname());
            preparedStatement.setString(3,student.getSsex());
            preparedStatement.setInt(4,student.getSage());
            preparedStatement.setString(2,student.getSdept());
            i = preparedStatement.executeUpdate();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (preparedStatement!=null)
                    preparedStatement.close();
                if (connection!=null)
                    connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return i;*/

    return JdbcUtil.executeUpdate("update Student set Sname=?,Ssex=?,Sage=?,Sdept=? where Sno=?",student.getSno(),student.getSname(),student.getSsex(),student.getSage(),student.getSdept());
    }


    @Override
    public int del(int Sno) {
       /* int i = 0;
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            //加载驱动
            Class.forName("com.mysql.jdbc.Driver");
            //创建连接
            connection = DriverManager.getConnection(url, username, password);
            //执行命令行，写sql语句
            preparedStatement = connection.prepareStatement("delete from Student where Sno=?");
            //设置问号的值
            preparedStatement.setInt(1,Sno);
            i = preparedStatement.executeUpdate();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (preparedStatement!=null)
                    preparedStatement.close();
                if (connection!=null)
                    connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return i;*/

        return JdbcUtil.executeUpdate("delete from Student where Sno=?",Sno);
    }

    @Override
    public Student quaryont(int Sno) {
        return null;
    }
}
