package com.Neuedu.Test0218.util;

import java.lang.reflect.Field;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JdbcUtil {
    private static final String URL = "jdbc:mysql://192.168.168.178/db1?useUnicode=true&characterEncoding=utf8";//工具类

    private static final String USERNAME = "root";
    private static final String PASSWORD = "wei8884402000";

    static {
        //加载驱动
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
    static Connection getConnection(){
        Connection con = null;
        try {
            con = DriverManager.getConnection(URL,USERNAME,PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;
    }
    //封装通用的增删改
    public static int executeUpdate(String sql,Object... params){
        int result = 0;
        Connection con = getConnection();
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = con.prepareStatement(sql);
            if (params!=null){
                for (int i = 0; i < params.length; i++) {
                    preparedStatement.setObject(i+1,i);
                }
            }
            result = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(con,preparedStatement);
        }
        return result;
    }
    // 封装通用查询
    public static <T> List<T> executeQuery(String sql, Class<T> clz, Object... params){
        // Student 继承 Object
        // List<Student> 没有继承关系 List<Object>
        List<T> list = new ArrayList<>();
        Connection con = getConnection();
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            pstmt = con.prepareStatement(sql);
            if(params != null){
                for(int i = 0; i < params.length; i++){
                    pstmt.setObject(i+1,params[i]);
                }
            }
            rs = pstmt.executeQuery();
            while(rs.next()){
                T t= clz.newInstance();
                Field[] fields = clz.getDeclaredFields();
                for(Field f : fields){
                    try {
                        String column=f.getName();
                        if(f.isAnnotationPresent(Column.class)){

                            Column c = f.getAnnotation(Column.class);
                            column = c.value();
                        }
                        Object value = rs.getObject(column);
                        f.setAccessible(true);
                        f.set(t, value);
                    }catch (Exception ex){}
                }
                list.add(t);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } finally {
            close(con,pstmt,rs);
        }
        return list;
    }
    //封装关闭方法
        static void close(Connection con,PreparedStatement preparedStatement){
            try {
                if (preparedStatement!=null)
                preparedStatement.close();
                if (con!=null)
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    static void close(Connection con, PreparedStatement preparedStatement, ResultSet resultSet){
        try {
            if (resultSet!=null)
                resultSet.close();
            close(con, preparedStatement);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
