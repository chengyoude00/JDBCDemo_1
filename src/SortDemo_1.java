/*
    Copyright (C), 2015-2019, XXX有限公司
    FileName: SortDemo_1
    Author:   cyd
    Date:     2019/9/9 21:03
    Description: 
     
 */


import java.util.*;

public class SortDemo_1 {
    //sort方法排序
    public static void main(String[] args) {
        SortedStudent s1 = new SortedStudent(1);
        SortedStudent s2 = new SortedStudent(2);
        SortedStudent s3 = new SortedStudent(3);
        SortedStudent s4 = new SortedStudent(4);
        List<SortedStudent> stuList  = new ArrayList<SortedStudent>();
        stuList.add(s2);
        stuList.add(s4);
        stuList.add(s1);


        stuList.add(s3);
        //以不排序的方法存入四个对象
        Collections.sort(stuList);
        //用collections的sort方法
        Collections.sort(stuList, new Comparator<SortedStudent>() {
            @Override
            public int compare(SortedStudent o1, SortedStudent o2) {
                if (s1.getId()==s2.getId()){
                    return 0;}else {
                    return  s1.getId()>s2.getId() ?1:-1;
                }
            }
        });
        Iterator<SortedStudent> it = stuList.iterator();
        while (it.hasNext()){
            System.out.println(it.next().getId());
        }
    }

}

