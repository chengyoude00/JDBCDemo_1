/*
    Copyright (C), 2015-2019, XXX有限公司
    FileName: IteratorDemo
    Author:   cyd
    Date:     2019/9/9 18:52
    Description: 
     
 */


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
    public static void main(String[] args) {
        List<String> arrList = new ArrayList<String>();
        for (int i = 0; i < 5; i++) {
            arrList.add(Integer.valueOf(i).toString());
        }
        Iterator<String> arrIt =arrList.iterator();
        while (arrIt.hasNext()){
            System.out.println(arrIt.next());
        }
    }

}

