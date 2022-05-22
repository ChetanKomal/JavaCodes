package com.company;

import java.util.*;
import java.util.HashSet;

public class Hash {
    public static void main(String[] args) {


        HashSet<ArrayList<Integer>> set=new HashSet<>();
       ArrayList<Integer> list =new ArrayList<>();
        list.add(2);
//         set.add(4);
//        set.add(2);
        list.add(3);
        set.add(list);
//        set.add(4);
//        set.add(4);
//        set.remove(4);

        System.out.println(set);
         System.out.println(set.size());
    }

}
