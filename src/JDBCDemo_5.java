/*
    Copyright (C), 2015-2019, XXX有限公司
    FileName: JDBCDemo_5
    Author:   cyd
    Date:     2019/9/5 14:15
    Description: 
     
 */


import java.sql.*;

public class JDBCDemo_5 {
    //1.注册
    public static void main(String[] args) {
        Connection conn =null;
        Statement stmt = null;
        ResultSet rs=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            //2.连接数据库
            conn = DriverManager.getConnection("jdbc:mysql:///cheshi","root","");
            stmt = conn.createStatement();
            //定义sql
            String  sql ="SELECT  *FROM  account;";//;"DELETE FROM account    WHERE id =8;";// "select  *from  account; ";
           // int count = stmt.executeUpdate(sql);
            rs = stmt.executeQuery(sql);

            while (rs.next()){
                int id = rs.getInt(1);
                String name = rs.getString("name");
                double balance = rs.getDouble(3);
                System.out.println("-----"+id+"----"+name+"---"+balance);

            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if (rs!=null){
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (stmt!=null){
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

}

