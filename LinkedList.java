package com.company;


public class LinkedList {
     Node head;
     //create a class for represent a node
    class Node {
        String data;
        Node next;
// create a Constructor named Node
        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }
    //add first element to list
        public void addFirst(String data){
            Node newNode= new Node(data);
            if(head==null){
                head=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;
        }
        //add last element to list
        public void addLast(String data){
        Node newNode= new Node(data);
        if(head==null){
         head=newNode;
            return;
        }
        Node currentNode=head;
        while(currentNode.next!=null){
            currentNode=currentNode.next;
        }
        currentNode.next=newNode;

    }
    //print linkedlist
    public void printList(){
        if(head==null){
            System.out.println("List is Empty");
            return;
        }
        Node currentNode=head;
        while(currentNode!=null){
            System.out.print((currentNode.data+"-->"));
            currentNode=currentNode.next;
        }
        System.out.print("Null");
    }

    public static void main(String[] arg){
        LinkedList list=new LinkedList();
        list.addFirst("a");
        list.addFirst("is");
        list.printList();

    }
}
