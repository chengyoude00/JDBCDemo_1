/*
    Copyright (C), 2015-2019, XXX有限公司
    FileName: JDBCDemo_10
    Author:   cyd
    Date:     2019/9/6 20:57
    Description: 
     
 */


import java.sql.*;

public class JDBCDemo_10 {

    public static void main(String[] args) {


        try {
            Class.forName("com.mysql.jdbc.Driver");
            //1.注册驱动
            Connection conn = DriverManager.getConnection("jdbc:mysql:///cheshi","root","");
//            String sql = "select * from user where username = '"+username+"' and password = '"+password+"' ";
            //2.数据连接
            String sql ="";
            //3.sql定义
            PreparedStatement stmt =conn.prepareStatement(sql);
            //4.获取sql
            ResultSet count = stmt.executeQuery();
            //5.执行并返回
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }




        //6.处理结果
        //7.释放资源
    }

}

