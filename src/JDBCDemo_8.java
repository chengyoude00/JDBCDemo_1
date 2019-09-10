/*
    Copyright (C), 2015-2019, XXX有限公司
    FileName: JDBCDemo_8
    Author:   cyd
    Date:     2019/9/5 18:54
    Description: 
     
 */


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JDBCDemo_8 {

public List<Emp> findAll(){
    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;
    List<Emp> list =null;
    try {
        conn= JDBCUtils.getConnection();
        String sql = "SELECT *FROM emp";
        stmt = conn.createStatement();
        rs = stmt.executeQuery(sql);
        Emp emp = null;
        list =new ArrayList<Emp>();
        while (rs.next()){
            int id=rs.getInt("id");
            String name = rs.getString("name");
            int age = rs.getInt("age");
            String dep_name = rs.getString("dep_name");
            String dep_location = rs.getString("dep_location");
            emp = new Emp();
            emp.setId(id);
            emp.setName(name);
            emp.setDep_name(dep_name);
            emp.setDep_location(dep_location);

            //装载集合
            list.add(emp);
        }

    } catch (SQLException e) {
        e.printStackTrace();

    }finally{
        JDBCUtils.close(rs,stmt,conn);
//        JDBCUtils.close(rs,stmt,conn);
    }
    return  list;
}

    public static void main(String[] args) {
    List<Emp> list= new JDBCDemo_8().findAll();
        System.out.println(list);
        System.out.println(list.size());


    }

}




