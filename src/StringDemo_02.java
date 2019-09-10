/*
    Copyright (C), 2015-2019, XXX有限公司
    FileName: StringDemo_02
    Author:   cyd
    Date:     2019/9/6 15:00
    Description: 
     
 */


public class StringDemo_02 {
    public static void main(String[] args) {
        final  String a="1";
        String b= "1";
        String c="123";

        String d= b+"23";

//        System.out.println(c.getClass());
        System.out.println(b.hashCode());
//        System.out.println(d.getClass());
        System.out.println(c.toString());
        System.out.println(d.hashCode());

        System.out.println(c==d);
        System.out.println(c);
        System.out.println(d);
    }

}

