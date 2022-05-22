package com.company;
import java.util.Scanner;
public class Array2D {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int cols=sc.nextInt();

        int numbers[][]=new int [rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                numbers[i][j]=sc.nextInt();
            }
        }
        //print output
        int x=sc.nextInt();
        for(int i=0;i<rows;i++) {
            for(int j=0;j<cols;j++) {
                //compare with x to find number present which index
                if (numbers[i][j] == x) {
                    System.out.println("("+i+ ","+j+ ")" );


                }
            }

        }
    }
}
