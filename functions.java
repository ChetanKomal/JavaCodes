package com.company;
import java.util.Scanner;
public class functions {
   /* public static int  calculateProduct(int a,int b){
        int product=a*b;
        return product;

    }
    */
    public static int calculateSum(int a,int b){

        return a+b;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        //int product=calculateProduct(a,b);
       // System.out.println(product);
        int c=calculateSum(a,b);
        System.out.println(c);




    }

}
