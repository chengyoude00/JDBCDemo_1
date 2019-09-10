/*
    Copyright (C), 2015-2019, XXX有限公司
    FileName: JDBCDemo_9
    Author:   cyd
    Date:     2019/9/5 21:33
    Description: 
     
 */


import java.sql.*;
import java.util.Scanner;

public class JDBCDemo_9 {
    public static void main(String[] args) {
        //键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String username = sc.nextLine();
        System.out.println("请输入密码：");
        String password = sc.nextLine();
        boolean flag = new JDBCDemo_9().login(username, password);
        if (flag){
            System.out.println("登陆成功");
        }else {
            System.out.println("密码或用户名错误");
        }
    }
    //登陆方法
    public  boolean login( String  username , String password){
        if (username==null||password==null){
            return  false;
        }
        Connection conn= null;
        PreparedStatement pstm = null;
//        Statement stmt =null;
        ResultSet rs = null;

        //连接数据库
        try {
             conn = JDBCUtils.getConnection();
//            String sql= "select *from user where username =''"+username+"'and  password = '"+password+",";
            String sql = "select * from user where username = ? and password = ?";
//            String sql = "select * from user where username = '"+username+"' and password = '"+password+"' ";
//            stmt = conn.createStatement();
                pstm=conn.prepareStatement(sql);
                pstm.setString(1,username);
                pstm.setString(2,password);
                rs = pstm.executeQuery();
//            //判断
//            if (rs.next()){
//                return  true:
//            }else {return  false;}
            return  rs.next();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.close(rs,pstm,conn);
        }
        return false;
    }

}

