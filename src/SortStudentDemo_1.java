/*
    Copyright (C), 2015-2019, XXX有限公司
    FileName: SortStudentDemo_1
    Author:   cyd
    Date:     2019/9/9 10:01
    Description: 
     
 */

import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

class SortedStudent implements  Comparable{
    private  int id;
    public      SortedStudent(int id){
        this.id = id;
    }

    public int getId() {
        return id;
    }


    public boolean equals(SortedStudent stu) {
//        if (this == stu) return true;
//        if (!(stu instanceof SortedStudent)) return false;
//        SortedStudent that = (SortedStudent) stu;
//        return id == that.id;
        if (stu.getId() == this.id){
            return  true;
        }
        else {
            return false;
        }
    }
    public  int compareTo(Object obj){
        if (obj instanceof  SortedStudent){
            SortedStudent s = (SortedStudent) obj;
            if (s.getId() == this.getId()){
                return  0;
            }else {
                return  s.getId()>this.getId() ? 1:-1;
            }
        }else {return 0;}
    }
}

public class SortStudentDemo_1 {
    public static void main(String[] args) {
        SortedStudent s1 = new SortedStudent(1);
        SortedStudent s2 = new SortedStudent(2);
        SortedStudent s3 = new SortedStudent(3);
        SortedStudent s4 = new SortedStudent(4);
        Set<SortedStudent>  stuSet = new TreeSet<SortedStudent>();
        stuSet.add(s2);
        stuSet.add(s4);
        stuSet.add(s1);
        stuSet.add(s3);
        Iterator<SortedStudent> itStu = stuSet.iterator();
        while (itStu.hasNext()){
            System.out.println("输出："+itStu.next().getId());
        }
    }

}

