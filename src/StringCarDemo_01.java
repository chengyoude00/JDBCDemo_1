/*
    Copyright (C), 2015-2019, XXX有限公司
    FileName: StringCarDemo_01
    Author:   cyd
    Date:     2019/9/5 13:30
    Description: 
     
 */


class  Car{
    int price;
    void move(){
        System.out.println("is moving");
    }
    void stop(){
        System.out.println("is stopped");

   }
    public  String toString(){
        return "This is my car.";
    }
}


public class StringCarDemo_01 {
    public static void main(String[] args) {
        Car car = new Car();
        car.move();
        car.stop();
        System.out.println(car);
    }
}

