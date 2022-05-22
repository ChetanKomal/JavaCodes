package com.company;
import java.util.Scanner;
public class BinarySearch {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size");
        int n=sc.nextInt();
        int arr[]=new int[n];
        //-------------------------------------
        System.out.println("Enter Sorted array");
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        //-------------------------------------
            int low=0;
            int high=arr.length-1;
            System.out.println("Enter Key");
            int key=sc.nextInt();
            while(low<=high){
                int mid=(low+high)/2;
                if(arr[mid]==key){
                    System.out.println("Element is found at index: " + mid);
                    break;
                }
                else if(key>arr[mid]){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                    System.out.println("Element is not found!");

                }

            }
    }
}

