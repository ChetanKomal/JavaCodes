package com.company;
import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean isPrime = true;
        for ( int i = 2; i <= n - 1; i++) {
                  if (n % i == 0) { //Not prime
                      isPrime = false;
                  }
              }

              if (isPrime == false) {
                  System.out.println("not prime ");
              } else {
                  System.out.println("Prime");
              }


        }
    }
