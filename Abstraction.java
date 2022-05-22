package com.company;

//Abstract class
 abstract public class Abstraction {

   abstract void start();
}
//Normal class
class Vehicle extends Abstraction{
     void start()
     {
         System.out.println("Start by kick");

     }
     public static void main(String[] args) {
         Vehicle v = new Vehicle();
         v.start();
        // Abstraction a = new Abstraction();
     }

}
class Car extends Vehicle{
     void start(){
         System.out.println("Self satrt");
     }
     public static void main(String[] args){

         Car c= new Car();
         Vehicle v = new Vehicle();
         v.start();
         c.start();
     }

        }
