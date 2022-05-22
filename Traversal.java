package com.company;

  class Node{
    char key;//for storage character,integer in node
    Node left,right;
    Node(char key){ //Constructor for initialize a key
        this.key=key;

    }
}
class TreeTraversal{
    Node root;
    void preordertraversal(Node n){
        if(n!=null){
            System.out.print(n.key+" ");
            preordertraversal(n.left);
            preordertraversal(n.right);
        }

    }
    void postordertraversal(Node n){
        if(n!=null){
            preordertraversal(n.left);
            preordertraversal(n.right);
            System.out.print(n.key+" ");
        }
    }
    void inordertraversal(Node n){
        if(n!=null){

            preordertraversal(n.left);
            System.out.print(n.key+" ");
            preordertraversal(n.right);

        }
    }
}
public class Traversal {
    public static void main(String[] args){
        TreeTraversal t1=new TreeTraversal();
        //Creation of a Binary Tree
        t1.root=new Node('A');//first node
        t1.root.left=new Node('B');
        t1.root.right=new Node('C');
        t1.root.left.left=new Node('D');
        t1.root.left.right=new Node('E');
        t1.preordertraversal(t1.root);
        System.out.println();
        t1.postordertraversal(t1.root);
        System.out.println();
        t1.inordertraversal(t1.root);




    }
}

