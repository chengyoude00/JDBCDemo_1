/*
    Copyright (C), 2015-2019, XXX有限公司
    FileName: LinketHashSetDemo_1
    Author:   cyd
    Date:     2019/9/8 10:17
    Description: 
     
 */


import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class LinketHashSetDemo_1 {
    public static void main(String[] args) {
        HashSet<String> Hashset = new HashSet<String>();
        LinkedHashSet<String> strLinkSet = new LinkedHashSet<String>();
        TreeSet<String> strTreSet = new TreeSet<String>();
        strTreSet.add("4");
        strTreSet.add("3");
        strTreSet.add("2");
        strTreSet.add("1");
        Iterator<String> strTreeIt = strTreSet.iterator();
        while (strTreeIt.hasNext()){
            System.out.print(strTreeIt.next()+" ");
        }
        System.out.println(" ");
        System.out.println("********************");
        for (int i = 0; i < 10; i++) {
            Hashset.add(String.valueOf(i));
            strLinkSet.add(String.valueOf(i));
        }
        Iterator<String> setStringIt = Hashset.iterator();
        while (setStringIt.hasNext()){
            System.out.print(setStringIt.next()+" ");
        }
        System.out.println(" " );
        System.out.println("************************************");
        Iterator<String> linkedStringIt = strLinkSet.iterator();
        while (linkedStringIt.hasNext()){
            System.out.print(linkedStringIt.next()+" ");
        }

    }
}

