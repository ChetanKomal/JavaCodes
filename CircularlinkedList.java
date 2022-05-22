package com.company;

public class CircularlinkedList {
    Node head,tail;
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
    }
    void insetElement(int data){
        Node newNode=new Node(data);
        if(head==null) {
            head = newNode;
            tail = newNode;
            tail.next = newNode;
        }
        else{
            tail.next=newNode;
            tail=newNode;
            tail.next=head;
        }
    }
    void displayElement(){
        Node n1=head;
        if(tail==null&&head==null){
            System.out.println("Nothing to print");
        }else{
            do{
                System.out.println(n1.data);
                n1=n1.next;
            }while(n1!=head);
        }
    }
    void deleteElements(){
        if(head!=tail){
            head=head.next;
            tail.next=head;

        }else{
            head=tail=null;

        }
    }
    public static void main(String[] args){

       CircularlinkedList list=new CircularlinkedList();
        list.insetElement(31);
        list.insetElement(32);
        list.insetElement(33);
        list.insetElement(34);
        list.deleteElements();
        list.displayElement();
        list.deleteElements();



    }
}
