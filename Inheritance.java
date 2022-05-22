package com.company;

//SingleInheritance
// Parent Class
public class Inheritance {
    //Method/properties
    void eat(){
        System.out.println("I am eating");
    }
}
//Child Class
class Inherit extends Inheritance{

    public static void main(String[] args){

        Inherit t=new Inherit();
        t.eat();
    }
}

//Mutilevel Inheritance
class Aman{
    void eat(){
        System.out.println("I am eating");
    }
    public static void main(String[] args){
        Aman a=new Aman();
        a.eat();
    }
}
class Bhawan extends Aman{
    void play() {
        System.out.println("I am playing");
    }
    public static void main(String[] args) {
        Bhawan b = new Bhawan();
       // b.eat();
        b.play();
    }

}
class Chman extends Bhawan{
    void dance() {
        System.out.println("I am dancing");
    }
    public static void main(String[] args) {
        Chman c = new Chman();
        c.play();
        c.dance();
        c.eat();

    }
}

