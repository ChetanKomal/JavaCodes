package com.company;

class Employee{
    int id;
    int salary;
    String name;
    //method1 by printing custom objects
    public void printDetails(){
        System.out.println("My id is " + id);
        System.out.println("and my name is "+ name);
    }
  //method2 by return int
    public int getSalary(){
        return salary;
    }
}

public class cwh_38_custom_class {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee harry = new Employee(); // Instantiating a new Employee Object
        Employee john = new Employee(); // Instantiating a new Employee Object

        // Setting Attributes for Harry
        harry.id = 12;
        harry.salary = 34;
        harry.name = "CodeWithHarry";
        // Printing the Attributes of method1 by using simple method
        harry.printDetails();
        //Direct print the Setting Attributes
        System.out.println(harry.id);
        System.out.println(harry.name);
        //Print the salary using return method .In return method  we need to make object to print the salary
        int salary = harry.getSalary();
        System.out.println(salary);





        // Setting Attributes for John
        john.id = 17;
        john.salary = 12;
        john.name = "John Khandelwal";
        //Printing the Attributes of method2
        john.printDetails();
        //Direct print the Setting Attributes
        System.out.println(john.id);
        System.out.println(john.name);




    }
}
