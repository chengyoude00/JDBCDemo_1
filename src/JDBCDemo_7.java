/*
    Copyright (C), 2015-2019, XXX有限公司
    FileName: JDBCDemo_7
    Author:   cyd
    Date:     2019/9/5 15:48
    Description: 
     
 */


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBCDemo_7 {
    public List<Emp> finaAll(){
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        List<Emp> list =null;
        //1.查询
        try {
            Class.forName("com.mysql.jdbc.Driver");
             conn =DriverManager.getConnection("jdbc:mysql:///cheshi","root","");
            String sql = "SELECT *FROM Emp;";
            stmt = conn.createStatement();
             rs = stmt.executeQuery(sql);
            Emp emp = null;
           list= new ArrayList<Emp>();
            while (rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                String dep_name = rs.getString("dep_name");
                String dep_location = rs.getString("dep_location");
                //创建对象然后再将数据进行封装
                emp = new Emp();
                emp.setId(id);
                emp.setName(name);
                emp.setAge(age);
                emp.setDep_name(dep_name);
                emp.setDep_location(dep_location);
                //装载集合
                list.add(emp);//E:\IDBC01\dateJDBC\src\JDBCUtils.java
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
            if (stmt != null){
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
        return  list;
    }
    public static void main(String[] args) {
        List<Emp> list = new JDBCDemo_7().finaAll();
        System.out.println(list);

    }

}

