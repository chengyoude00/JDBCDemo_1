/*
    Copyright (C), 2015-2019, XXX有限公司
    FileName: C3P0Demo_1
    Author:   cyd
    Date:     2019/9/7 16:43
    Description: 
     
 */


import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class C3P0Demo_1 {
    public static void main(String[] args) throws SQLException {
        //1.创建数据库连接池对象
        DataSource ds =new ComboPooledDataSource();
        //2.获取对象
        //获取10个对象v

        for (int i = 1; i <= 10; i++) {
            Connection conn = ds.getConnection();
            System.out.println(i+":"+conn);

        }
        //3.打印
//        System.out.println(conn);

    }

}

