/*
    Copyright (C), 2015-2019, XXX有限公司
    FileName: JDBCDemo_11
    Author:   cyd
    Date:     2019/9/7 15:14
    Description: 
     
 */


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCDemo_11 {
    public static void main(String[] args) {
        Connection conn =null;
        PreparedStatement pstmt1 = null;
        PreparedStatement pstmt2 = null;
        try {
            //获取连接
            conn = JDBCUtils.getConnection();
            //开启事务
            conn.setAutoCommit(false);
            String  sql = "update account set balance = balance-? where id =?;";
            String sql2 ="update account set balance = balance +? where id = ?;";
            pstmt1 = conn.prepareStatement(sql);
            pstmt2 = conn.prepareStatement(sql2);
            pstmt1.setDouble(1,500);//设置参数
            pstmt1.setInt(2,1);
            pstmt2.setDouble(1,500);
            pstmt2.setInt(2,2);//设置参数
            pstmt1.executeUpdate();
            pstmt2.executeUpdate();
//            int a= 3/0;
            conn.commit();//提交事务
        } catch (Exception e) {
            try {
                if (conn!=null){
                conn.rollback();}//回滚事务
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
            e.printStackTrace();
        }finally {
            JDBCUtils.close(pstmt1,pstmt2,conn);


        }
    }

}

