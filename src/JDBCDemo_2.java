/*
    Copyright (C), 2015-2019, XXX有限公司
    FileName: JDBCDemo_2
    Author:   cyd
    Date:     2019/9/4 9:09
    Description: 
     
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo_2 {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        //1.导入驱动jar包
        //2.注册驱动
        try {
            Class.forName("com.mysql.jdbc.Driver");

        //3.获取数据库连接对象
         conn = DriverManager.getConnection("jdbc:mysql:///cheshi","root","");
        //4.定义sql
        String sql = "DELETE FROM account WHERE id =4; ";
        //5.获取执行sql语句的对象statement
        stmt = conn.createStatement();
        //6.执行sql接受返回结果
        int count = stmt.executeUpdate(sql);
        //7.处理结果
        System.out.println(count);
        if (count > 0) {
            System.out.println("添加成功！");
        }
        else {
            System.out.println("添加失败！");
        }
        }
     catch (ClassNotFoundException | SQLException e) {
        e.printStackTrace();
    }finally {
            if (stmt !=null){
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn!= null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

        //8.资源释放

    }



