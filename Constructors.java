package com.company;

public class Constructors {
    //Create instance variable
    int age;
    //Create a constructor
    Constructors(int age)
    {
        System.out.println("no arg constructor");
        this.age=age;

    }

    public static void main(String[] args){

        Constructors t=new Constructors(10);
        System.out.println(t.age);
    }
}
