/*
    Copyright (C), 2015-2019, XXX有限公司
    FileName: jdbaDemo1
    Author:   cyd
    Date:     2019/9/2 20:51
    Description: 
     
 */
package cnidjdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

//jdba快速入门
public class jdbaDemo1 {
    //JDBC 驱动器名称喝数据库地址
    //static final String JDBC_DRIVER ="com.mysql.jdbc.Driver";
    //数据库名称为EX
    // AMPLE
    //static final String  DB_URL ="jdbc:mysql://localhost//EXAMPLE";
    //数据库用户喝密码
    //static final String USER = "root";
//    static final String PASS ="";

    public static void main(String[] args) throws Exception {
        //1.导入驱动jar包
        //2.注册驱动
//        Class.forName("com.mysql.jdbc.Driver");

        Class.forName("com.mysql.jdbc.Driver");
        //3.获取数据库连接对象
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cheshi", "root", "");
        //4.定义一个sql语句
        String sql="update account set balance =500 where id = 1";
        //5.获取执行sql的对象statement
//        Connection conn =null;
        Statement stmt = conn.createStatement();
        //6.执行sql
        int count = stmt.executeUpdate(sql);
        //7.处理结果
        System.out.println(count);
        //8.释放资源
        stmt.close();
        conn.close();


    }

}

