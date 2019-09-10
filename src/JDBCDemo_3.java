/*
    Copyright (C), 2015-2019, XXX有限公司
    FileName: JDBCDemo_3
    Author:   cyd
    Date:     2019/9/4 15:19
    Description: 
     
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo_3 {
    public static void main(String[] args) {
        Connection conn= null;
        Statement stmt =null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql:///cheshi","root","");
            String sql ="INSERT INTO account values(null,'huang','3232');";
             stmt = conn.createStatement();
            int count = stmt.executeUpdate(sql);
            System.out.println(count);
            if (count>0){
                System.out.println("操作成功！");
            }else{
                System.out.println("操作失败！");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {

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

