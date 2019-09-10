/*
    Copyright (C), 2015-2019, XXX有限公司
    FileName: SetDemo_01
    Author:   cyd
    Date:     2019/9/7 13:20
    Description: 
     
 */


import java.util.ArrayList;
import java.util.HashSet;

public class SetDemo_01 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("1");
        list.add(null);
        list.add(null);
        HashSet set = new HashSet();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
            set.add(list.get(i));
        }
        System.out.println(set.size());
        for (Object str : set){
            System.out.println(str);
        }
    }

}

