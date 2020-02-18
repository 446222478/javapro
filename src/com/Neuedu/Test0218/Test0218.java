package com.Neuedu.Test0218;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Test0218 {
    public static void main(String[] args) {

        String url = "jdbc:mysql://192.168.168.178:3306/db1?useUnicode=true&characterEncoding=utf8";
        String username = "root";
        String password = "wei8884402000";
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            //1 新建mysql
            Class.forName("com.mysql.jdbc.Driver");
            //2 新建连接， 主机IP 端口号 用户名 密码
            connection = DriverManager.getConnection(url,username,password);
            //3 选择一个数据库
            /*在jdbc中省略*/
            //4 创建一个写sql语句的地方
            preparedStatement = connection.prepareStatement("insert into Student(Sno,Sname,Ssex,Sage,Sdept) values(123,'阿黄顺','男',17,'卓越一班')");
            //5 写sql语句
            /*在jdbc中，该操作包含在创建PreparedStatement中*/
            //6 执行sql语句
            /*增删改 用PreparedStatement对象调用 executeUpdate方法 返回int（受影响的行数）*/
            /*查询 用PreparedStatement对象调用 executeQuery方法 返回ResSet对象（结果集）*/
            preparedStatement.executeUpdate();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e){
            e.printStackTrace();
        } finally {
            //使用后要关闭资源
            try {
                if (preparedStatement!=null)
                preparedStatement.close();
                if (connection!=null)
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
