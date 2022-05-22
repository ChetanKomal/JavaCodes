package com.company;

class QueueUsingArray{
    int front_Q,rear_Q;
    int capacityOfQueue;
    static int [] q1;

    QueueUsingArray(int size){ //Constructor
        capacityOfQueue=size;
        q1=new int[capacityOfQueue];
    }
    void enqueue(int value){
        if(rear_Q==capacityOfQueue){
            System.out.println("Queue is already full, you cant insert element ");
        }else{
            q1[rear_Q]=value;
            rear_Q++;
        }
    }
    void dequeue(){
        //if(front_Q==rear_Q)
        if(rear_Q==0){
            System.out.println("Queue is Empty ,there is nothing to delete");
        }
        else{
            for(int i=0;i<rear_Q-1;i++){
                q1[i]=q1[i+1];
            }
            rear_Q--;

        }
    }
    void display() {
        //if(front_Q==rear_Q)
        if(rear_Q==0){
            System.out.println("Queue is Empty ,there is nothing to delete");
        }
        else {
            for(int i=0;i<rear_Q;i++){
                System.out.print(q1[i]+" ");
            }
        }

    }

}
public class Queues {
    public static  void main(String[] args){
        QueueUsingArray q2=new QueueUsingArray(5);
        q2.enqueue(2);
        q2.enqueue(3);
        q2.enqueue(5);
        q2.dequeue();
        System.out.println();

        q2.display();

    }
}
