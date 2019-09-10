/*
    Copyright (C), 2015-2019, XXX有限公司
    FileName: ArrayComparDemo_1
    Author:   cyd
    Date:     2019/9/7 14:10
    Description: 
     
 */


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ArrayComparDemo_1 {

    static void TestAddTail(List list , String type){
        int size = 1000000;
        long start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("类型:"+type);
        System.out.println("TestAddTail运行时间为："+(end-start));
    }
    static  void  TestRandomSearch(List list ,String type){
        Random random = new Random();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            list.indexOf(random.nextInt(10000));
        }
        long end = System.currentTimeMillis();
        System.out.println("类型："+type);
        System.out.println("TestRandomSearch运行时间是："+(end-start));
    }
    static  void  TestAddRandom(List list , String type){
        Random random = new Random();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            list.add(random.nextInt(100000),"0");
        }
        long end = System.currentTimeMillis();
        System.out.println("类型："+type);
        System.out.println( "TestAddRandom运行时间为："+(end-start));
    }

    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        LinkedList linkedList = new LinkedList();
        TestAddTail(arrayList,"ArrayList");
        TestAddTail(linkedList,"LinkedLlist");
        TestRandomSearch(arrayList,"ArrayList");
        TestRandomSearch(linkedList,"LinkedList");
        TestAddRandom(arrayList,"ArrayList");
        TestAddRandom(linkedList,"LinkedList");
    }
}

