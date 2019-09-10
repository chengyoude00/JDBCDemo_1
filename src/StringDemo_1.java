/*
    Copyright (C), 2015-2019, XXX有限公司
    FileName: StringDemo_1
    Author:   cyd
    Date:     2019/9/5 10:14
    Description: 
     
 */


public class StringDemo_1 {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        builder.append("143").append("256");
        System.out.println(builder);
        System.out.println(builder.substring(0,4));
        System.out.println(builder);
        builder.replace(0,3,"aa");
        System.out.println(builder);
        builder.deleteCharAt(0);
        System.out.println(builder);

    }

}

