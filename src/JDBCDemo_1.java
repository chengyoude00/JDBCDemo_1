/*
    Copyright (C), 2015-2019, XXX有限公司
    FileName: JDBCDemo_1
    Author:   cyd
    Date:     2019/9/3 21:20
    Description: 
     
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo_1 {
    public static void main(String[] args) {
        Statement stmt =null;
        Connection conn =null;
        //添加一条记录insert
        try {

            //1.注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2.定义sql
            String sql = "insert into account values(null,'wangwu',6000)";
            //3.获取Connection 对象
             conn = DriverManager.getConnection("jdbc:mysql:///cheshi", "root", "");
            //4.获取sql对象statement.l
             stmt = conn.createStatement();

            //5.执行sql
            int count = stmt.executeUpdate(sql);
            //影响函数
            //6.处理结果
            System.out.println(count);
            if (count>0){
                System.out.println("添加成功");
            }else {
                System.out.println("添加失败！");
            }


        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }finally {
            //防止空指针进行if判断再释放资源
            if (stmt!=null)
            {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }

            }
            if (conn!=null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

        }

    }

}

