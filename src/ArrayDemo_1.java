/*
    Copyright (C), 2015-2019, XXX有限公司
    FileName: ArrayDemo_1
    Author:   cyd
    Date:     2019/9/7 9:33
    Description: 
     
 */

class  Person{
    int id;
}

public class ArrayDemo_1 {




    public static void main(String[] args) throws  NullPointerException {
        Person [] a = null;
        Person [] b = new Person[3];
        for (int i = 0; i <b.length ; i++) {
            b[i] = new Person(); }
        Person [] c ={ new Person(),new Person(),new Person()};
        if (a!=null){
        System.out.println("a.length="+a.length);}
        if (b!=null){
        System.out.println("b.length="+b.length);}
        int [] intArr = {1,2,3};
        for (int i = 0; i < intArr.length; i++) {
            System.out.println(intArr[i]);
        }
    }

}

