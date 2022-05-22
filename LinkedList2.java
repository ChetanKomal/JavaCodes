package com.company;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class LinkedList2 {
    public static void main(String[] args) {
      //  LinkedList<Integer> l1 = new LinkedList<>();
        //adding element to the linkedList
        /*
        l1.add(4);
        l1.add(38);
        l1.add(34);
        l1.add(32);
        //add new element in between linkedList
        l1.add(2, 33);
//        //remove a particular index element from the linkedList
        l1.remove(2);
//        // remove first element from the list
        l1.removeFirst();
//        // remove last element from the list
        l1.removeLast();
//        // to access list elements through iteration
        Iterator it = l1.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        l1.addFirst(2);
        l1.addLast(4);
//
        System.out.println(l1);
        // to find Size of linkedList
        System.out.println(l1.size());
        //to find whether the element present in the linkedList or not
        boolean b1 = l1.contains(34);
        System.out.println(b1);


//        //Copy element from stack to linkedList
        Stack<String> st = new Stack<>(); //create a stack
        LinkedList<String> l2 = new LinkedList<>();//  create a blank linkedList
        st.push("hello");
        st.push("friend");

        l2.addAll(st);
        System.out.println(l2);
        Iterator it2 = l2.iterator();
        while (it2.hasNext()) {
            System.out.println(it2.next());
        }

    }

         */

        //Delete first node/element from list
        //Input list element using array
        LinkedList<Integer> l1 = new LinkedList<>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int l=arr.length;
        for(int i=0;i<=l-1;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=l-1;i>=0;i--){
            l1.add(arr[i]);

        }

        //l1.removeFirst();
        //l1.removeLast();
        System.out.println(l1);





    }

}
