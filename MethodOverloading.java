package com.company;

public class MethodOverloading{

    void eat(String a){
        System.out.println("I am eating");

    }

    void eat(int a){
        System.out.println("I am eating");

    }
    public static void main(String[] ags){
        MethodOverloading t =new MethodOverloading();
        t.eat("Khushwant");

    }
}
