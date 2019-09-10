/*
    Copyright (C), 2015-2019, XXX有限公司
    FileName: SetDemo_1
    Author:   cyd
    Date:     2019/9/8 9:49
    Description: 
     
 */


import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

class  Student implements  Comparable{
    private int id;
    public Student(int id){
        this.id = id;
    }

    public int getId() {
        return id;
    }
    public  boolean equals(Student stu){
        if (stu.getId() == this.id){
            return  true;
        }else {
            return  false;
        }
    }
    public int  compareTo(Object obj){
        if (obj instanceof Student){
            Student s = (Student) obj;
            if (s.getId() == getId()){
                return  0;
            }else {return  s.getId()>this.getId() ?1:-1;}

        }else {return  0;}
    }
}
public class SetDemo_1 {
    public static void main(String[] args) {
        HashSet<Object> intSet = new HashSet<>();
        intSet.add(1);
        intSet.add(1);
        System.out.println(intSet.size());
        Student s1 = new Student(1);
        Student s2 = new Student(1);
        Set<Student> stuSet = new TreeSet<Student>();
        stuSet.add(s1);
        stuSet.add(s2);
        System.out.println(stuSet.size());
    }
}

