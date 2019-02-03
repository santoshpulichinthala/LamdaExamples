package Comparator;

import java.util.*;

public class UseComparator {
    public static void main(String args[]){

        List<Integer> list = new ArrayList<>();

        //Set<int> set = new TreeSet<String>();

        list.add(10);
        list.add(9);
        list.add(3);

        Collections.sort(list);

        //old way
        for (int val : list)
            System.out.println(val);

        //new way 1.8 version
        list.forEach((str)-> System.out.println(str));

//        Comparator<Integer> comparator = new Comparator<Integer>(){
//
//            public int compare(Integer o1, Integer o2) {
//                return o1.compareTo(o2);
//            }
//        };

        Comparator<Integer> comparator1 = (s1,s2)-> s1.compareTo(s2);

        Collections.sort(list,comparator1);



        //new way 1.8 version
        list.forEach((str)-> System.out.println(str));


    }
}
