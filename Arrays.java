package com.company;
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();

//        int marks[]=new int[n];
        //int marks[]={2,4,6,8,10,24,23};
       /* marks[0]=12;
        marks[1]=12;
        marks[2]=12;


        //input
        for(int i=0;i<n;i++) {
            marks[i] = sc.nextInt();
        }
//output
        for(int i=0;i<n;i++){
            System.out.println(marks[i]);
        }
    }



           // Check Product of array elements is even or odd
        int n=sc.nextInt();
        int arr[]= new int[n];
        for(int i=1;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int l=arr.length;
        int temp=1;
        for(int i=1;i<l;i++){
             temp=temp*arr[i];
        }
        if(temp%2==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }

        */


//        int n=sc.nextInt();
//        int arr=new int[n];
//        for(int i=1;i<n;i++){
//            arr[i]=sc.nextInt();
        //Find out the array element whom equal to the length of that array and also print that element index no
       /* int arr[]={22,5,2,31,3,2};
        int l=arr.length;


        */

       /* for(int i=0;i<l-1;i++){
            if(arr[i]==l){
                System.out.println("The element is :"+arr[i]+" "+"Index no is :"+i);
            }
        }





        //Check whether the first element of array is equal to the last element

        for(int i=0;i<l-1;i++){
            if(arr[0]==arr[l-1]){
                System.out.println("Element are equal");
                break;
            }else{
            System.out.println("Not equal");
            break;
            }

        }


        //Find out that element from array who equal to the last element

        for(int i=0;i<l-1;i++){
            if(arr[i]==arr[l-1]){
                System.out.println(arr[i]+" ");
            }
        }


        //Find out the sum of array elements
        int sum=0;
        for(int i=0;i<l-1;i++){
                sum=sum+arr[i];
        }
        System.out.println(sum);


        //Find out the greatest element in array
        int max=arr[0];
        for(int i=1;i<l-1;i++){
            if(arr[i]>max){
                max=arr[i];
                System.out.println(max);
            }

        }


        //Find out that elements from array whose sum is equal to the key element and also print that elements index no
        int key=4;
        for(int i=0;i<l-1;i++){
            for(int j=0;j<l-1;j++){
                if(arr[i]+arr[j]==key){
                  System.out.println(arr[i]+" "+arr[j]+" " +i+" "+j);
                }
            }
        }


        //Find out the minimum element in array
        int min=arr[0];
        for(int i=0;i<l-1;i++){
            if(arr[i]<min){
                min=arr[i];
                System.out.println(min);
            }

        }


        //Sorting

        //Bubble sort
        for(int i=0;i<l-1;i++) {
            for (int j = 0; j < l - 1; j++) {
                if (arr[j + 1] < arr[j]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
        }
            for(int j=0;j<l-1;j++){
                System.out.println(arr[j]);


        }


            //Insertion sort
        int arr[]={4,3,2,5,6,3,};
        int l=arr.length;
        for(int i=1;i<l-1;i++){
            int temp=arr[i];
            int j=i-1;
            while(j>=0&&arr[j]>temp){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;

        }
        for(int i=0;i<l-1;i++){
            System.out.println(arr[i]+"");
        }

        */
        //Selection sort

        /*int arr[]={3,5,2,5,2,54,4};
                int l=arr.length;
                int min=arr[0];
        for(int i=0;i<l-1;i++){
            if(arr[i]<min){
                min=arr[i];
            }
            int temp=min;
            arr[0]=temp;
            min=arr[0];
        }
        System.out.println(arr[]+" ");


        //Find minimum and maximum element in array

        int arr[] = {43, 5, 2, 5, 32, 2};
        int l = arr.length;
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < l - 1; i++) {
            if (arr[i] < min) {
                min = arr[i];
            } else if (arr[i] > max) {
                max = arr[i];
            }
           
        }
        System.out.println(min + " " + max);
    }
}

    //Reverse the array element
        int arr[]={2,3,5,16,7,28};
        int l=arr.length;
        for(int i=l-1;i>=0;i--){
            System.out.println(arr[i]+" ");

            }

        }



         */

       /* Input:
        N = 5
        arr[] = 7 10 4 20 15
        K = 4
        Output : 15



        int arr[] = {7, 10, 4, 20, 15};
        int k = 4;
        int l = arr.length;
        for (int i = 0; i < l - 1; i++) {
            if (arr[i]==k) {
                System.out.println(arr[k] + " ");
            }
         }




        //Find the occurrence of an element in array

        int arr[]={2,5,2,3,4,5};

        int l=arr.length;
        int x=5;
        int count=0;
        for(int i=1;i<l;i++){
            if(arr[i]==x){
                count++;
            }
        }
        System.out.println(count);


        //remove duplicates from sorted array using brute force
        int arr[]={1,2,3,4,4,5};
        int l=arr.length;
        int j=0; // pointer
           for(int i=0;i<l-1;i++){
               if(arr[i]!=arr[i+1]) {
              arr[j]=arr[i];
               j++;
               }
               }
          arr[j]=arr[l-1];
           for(int i=0;i<j+1;i++){
               System.out.println(arr[i]);
           }


        // remove duplicates from array (sorted/unsorted both) using hashset
        int arr[]={2,5,21,5,324,5,4,5};
        int l=arr.length;
        HashSet<Integer> s=new HashSet<>();
         for(int i=0;i<l-1;i++){

             s.add(arr[i]);

         }
         for(int no:s){
             System.out.println(no);

         }



        //count duplicates element from array
        //print index no where duplicates are present
        //size/length/last index no of array after removal duplicates element
        int arr[]={3,2,43,5,3,4,53,4};
        int l=arr.length;
        int j=0;
      //  int count=0;
        for(int i=0;i<l-1;i++){
            if(arr[i]!=arr[i+1]){
                arr[j]=arr[i];
                j++;
               // count++;
            }
        }
        return j;




           // insert a given  element in array

        int arr[]={2,4,5,6,7,8}; //pos--> 1 2 3 4 5 6
                                 //index-->0 1 2 3 4 5
                                 //length-->6
        int key=3; int pos=2;
        int l=arr.length;
        for(int i=l-1;i>pos-1;i--){
            arr[i]=arr[i-1];
        }
        arr[pos-1]=key;
        for(int i=0;i<l;i++){
            System.out.println(arr[i]);
        }



        //insert a element at given index
        int arr[]={2,3,4,5,6};
        int key=32; int index=2;
        int l=arr.length;
        for(int i=0;i<=l-1;i++){
            if(i==index){
                arr[index]=key;
            }
            System.out.println(arr[i]+"");
        }



        //sort an array
        int arr[] = {2, 43, 45, 12, 43, 12};
        int l = arr.length;
        for (int i = 0; i < l - 1; i++) {
            for(int j=0;j<l-1;j++){
                if(arr[j+1]<arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for ( int j = 0; j < l - 1; j++) {
            System.out.println(arr[j]);
        }


        //insert a element in array
        int arr[] = {32, 4, 23, 32, 54, 32};
        int key = 45;
        int pos = 3;
        int l = arr.length;
        for (int i = l - 1; i > pos - 1; i--) {
            arr[i] = arr[i - 1];

        }
        arr[pos - 1] = key;
        for (int i = 0; i < l; i++) {
            System.out.println(arr[i]);
        }


        //Remove a element from array
        int arr[]={43,2,21,42,12};
        int l=arr.length;
        int pos=4;
        for(int i=0;i<l;i++){
            if(i==pos-1){
                continue;
            }
            else{
                System.out.println(arr[i]);
            }

        }

        */

    }
}









