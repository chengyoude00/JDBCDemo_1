/*
    Copyright (C), 2015-2019, XXX有限公司
    FileName: GenericExtends
    Author:   cyd
    Date:     2019/9/9 21:37
    Description: 
     
 */

import java.util.ArrayList;
import java.util.List;

class  Father{}
class  Son extends  Father{}

public class GenericExtends {
    static  void  copy(List<? super Father> dest,List<?extends  Father> src){
        for (int i = 0; i < src.size(); i++) {
            dest.add(src.get(i));
        }
    }
    public static void main(String[] args) {
        Father f = new Father();
        Son s = new Son();
        //创建一个带泛型的集合，并放入元素
        List<Father> srcFatherList = new ArrayList<>();
        srcFatherList.add(f);
        ArrayList<Father> destFatherList = new ArrayList<>();
        copy(destFatherList,srcFatherList);
        System.out.println(destFatherList.size());
    }
}

