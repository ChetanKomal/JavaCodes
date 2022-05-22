package com.company;
import java.util.Scanner;
public class Palindrome {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int rev=0;
        //reverse logic
        while(temp>0){
           int rem=temp%10;
            rev=rev*10+rem;
           temp=temp/10;
        }
        //compare reverse to original number
        if(n==rev){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }

    }
}
