package com.company;

public class ClassesObjectMethod {
    //Create eat method
    static void eat(){
        System.out.println("I am eating");

    }
    static void run(){
        System.out.println("I ma running");
    }
    //Main method
    public static void main(String[] args){
        System.out.println("I am fine");
       //Create a Object
        ClassesObjectMethod dog=new ClassesObjectMethod ();
        dog.eat();
        dog.run();
        // Create a object from Birds class name to use fly method in a class ClassesObjectMethod
        Birds sparrow=new Birds();
        sparrow.fly();
        //2nd object
        ClassesObjectMethod cat=new ClassesObjectMethod ();
        cat.run();
    }
}
class Birds{

    void fly(){
        System.out.println("I am flying");
    }

}

