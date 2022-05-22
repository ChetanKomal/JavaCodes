package com.company;
import java.util.Scanner;

public class cwh_18_elseif_switch_case {
    public static void main(String[] args) {

        System.out.println("Enter Your Age");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
       /*if (age > 56) {
            System.out.println("You are experienced!");
        } else if (age > 46) {
            System.out.println("You are semi-experienced!");
        } else if (age > 36) {
            System.out.println("You are semi-semi-experienced!");
        } else {
            System.out.println("You are not experienced");
        }
        if (age > 2) {
            System.out.println("You are not a baby!");
        }


        */
        switch (age){
            case 18:
                System.out.println("You are going to be adult");
                break;
            case 21:
                System.out.println("You are going to join a job");
                break;
            case 60:
                System.out.println("You are going to be retired");
                break;
            default:
                System.out.println("Enjoy your life!");

            }
        }

    }


