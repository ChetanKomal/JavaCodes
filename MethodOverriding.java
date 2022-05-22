package com.company;
//Parent class
public class MethodOverriding {

    void eat(int a, String b){
        System.out.println("I am eating2");
    }
}
//Child class
class Dog extends MethodOverriding{

    void eat(int a,String b){
        System.out.println("I am eating");

    }
    public static void main(String[] args){

        Dog d= new Dog();
        d.eat(14,"Khushwant");
        MethodOverriding m= new MethodOverriding();
        m.eat(18,"Singh");
    }

}
