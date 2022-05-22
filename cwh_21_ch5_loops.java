package com.company;
import java.util.Scanner;
public class cwh_21_ch5_loops {
    public static void main(String[] args) {
//        System.out.println(1);
//        System.out.println(2);
//        System.out.println(3);
//
//        System.out.println("Using Loops:");
//        int i = 100;
//        while(i<=200){
//            System.out.println(i);
//            i++;
//        }
//        System.out.println("Finish Running While Loop!");

//        while(true){
//            System.out.println("I am an infinite while loop!");
//        }
        //Reverse a number

        int n,rev=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        while(n>0){
            int rem=n%10;
            rev= rev*10+rem;
            n=n/10;

        }
        System.out.println(rev);
    }
}
