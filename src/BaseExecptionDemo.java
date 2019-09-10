/*
    Copyright (C), 2015-2019, XXX有限公司
    FileName: BaseExecptionDemo
    Author:   cyd
    Date:     2019/9/10 9:52
    Description: 
     
 */


public class BaseExecptionDemo {
    public static void main(String[] args) {
        int i = 0;
        int  a [] = {1,2,3,4};
        try {
            System.out.println("Before while.");
            //数组越界错误
            while (i<5){
                System.out.println(a[i]);
                i++;
            }
            //
            System.out.println("After while.");
        }catch (Exception e){
            System.out.println("Execption  happens!");
        }finally {
            a = null;
        }
        System.out.println("After - try-catch");
    }
}

