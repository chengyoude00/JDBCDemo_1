/*
    Copyright (C), 2015-2019, XXX有限公司
    FileName: HashMapDemo
    Author:   cyd
    Date:     2019/9/7 9:57
    Description: 
     
 */


import java.util.HashMap;

class  Book{
    private  String ISBN;
    private String name;
    private  String price;
    //构造函数
    public  Book (String ISBN ,String name ,String price){
        this.ISBN =ISBN;
        this.name = name;
        this.price = price;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
public class HashMapDemo {
    public static void main(String[] args) {
        HashMap hm = new HashMap();
        Book javabook = new Book("123", "Java", "55.5f");
        Book dbbook = new Book("456", "DB", "90f");
        hm.put(javabook.getISBN(),javabook);//存放对象
        hm.put(dbbook.getISBN(),dbbook);
            Book book = null;
            if (hm.containsKey("123")){//判断是否存在某个对象
                book =(Book)hm.get("123");//获取对象
                System.out.println( book.getName()+","+book.getPrice());
            }

    }
}

