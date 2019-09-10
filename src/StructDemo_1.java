/*
    Copyright (C), 2015-2019, XXX有限公司
    FileName: StructDemo_1
    Author:   cyd
    Date:     2019/9/6 16:35
    Description: 
     
 */

 class  parent{
    private  int  value;
    private  String msg;
    public  parent(){
        this(0,"call with no param function");
    }
    public  parent(int val){
        this.value =val;
        System.out.println("with one param");
    }
    public  parent(int val,String msg){
        System.out.println("msg is :"+msg);
        System.out.println( "with 2 param");
    }
}
class  child extends parent{
     public  child(int i){
        super(i);
         System.out.println("in child");
     }
}

public class StructDemo_1 {
    public static void main(String[] args) {
        parent p0 = new parent();
        parent p1 = new child(1);
        parent p2 = new parent(1, "new parent");

    }

}

