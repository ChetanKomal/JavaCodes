package com.company;
//Create interfaces
 interface I1{

    abstract void show();
}
interface I2{
     abstract void dance();
}
// Noraml class , isme mutiple inheritance hota h
class Cat implements I1 ,I2{
   public void show(){
         System.out.println("I am eating");
     }
     public void dance(){
       System.out.println("I am dancing");
     }
     public static void main(String[] args) {
         Cat t = new Cat();
         t.show();
         t.dance();

     }

}

