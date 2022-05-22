package com.company;
import java.util.Scanner;

public class cwh_13_strings {
    public static void main(String[] args) {
        // String name = new String("Harry");
        // String name = "Harry";
        // System.out.print("The name is: ");
        // System.out.print(name);
//        int a = 6;
//        float b = 5.6454f;
//        System.out.printf("The value of a is %d and value of b is %8.2f", a, b);
//        //System.out.format("The value of a is %d and value of b is %f", a, b);
//        Scanner sc = new Scanner(System.in);
//        String st = sc.next();
//        String st = sc.nextLine();
//        System.out.println(st);
        //Reverse a String
//        Scanner sc = new Scanner(System.in);
//        String name = sc.nextLine();
//        int l = name.length();
//        String rev = "";
//        for (int i = l - 1; i > 0; i--) {
//            rev = rev + name.charAt(i);
//        }
//        System.out.println(rev);
//    }
//}

        // check palindromic string
//    public static boolean isPalindromicString(String str){
//        if(str==null)
//            return false;
//        int l=str.length();
//        for(int i=1;i<l/2;i++){
//            if(str.charAt(i)!==str.charAt(length-i-1))
//                return false;
//        }
//            return true;
//        }
//    }
//    }
//        // check  Palindromic string
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        int l = str.length();
//        String rev = " ";
//        for (int i = l - 1; i >= 0; i--) {
//            rev = rev + str.charAt(i);
//        }
//        if (str.equals(rev))
//            System.out.println("Palindromic");
//
//        else
//            System.out.println("Not Palindrome");
//
//    }
 //}
           //count characters in string
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int count=0;
        String rev="";
        char Chars[] = str.toCharArray();
        for (int i = Chars.length - 1; i >= 0; i--) {
          count++;
        }
          System.out.println(count);

    }

}
    //check duplicates in string










