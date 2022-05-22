package com.company;

 class Encapsulation {
    private int emp_id;

    public void setEmp_id(int n){

        emp_id=n;

    }
    public  int  getEmp_id(){

        return emp_id;
    }


}
class Capsule extends Encapsulation{
    public static void main(String[] args){
        Capsule c= new Capsule();
        c.setEmp_id(10);
        System.out.println(c.getEmp_id());
    }


}
