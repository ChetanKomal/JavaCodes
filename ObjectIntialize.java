package com.company;

public class ObjectIntialize {
    //by using reference
    String color;
    int age;

    public static void main(String[] args){

        ObjectIntialize car=new ObjectIntialize();
             car.color="White";
             System.out.println(car.color+" ");

    }
}
//by using method
class Animal{
    String color;
    int age;
    void initObject(String c, int a){
        color=c;
        age=a;
    }
    void display(){
        System.out.println(color+" "+age+" ");
    }

    public static void main(String[] args){
        Animal buzo=new Animal();
        buzo.initObject("White",1);
        buzo.display();

    }
}
