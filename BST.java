package com.company;

 class Node1{
     char key;
     Node left,right;
     Node1(char key){
         this.key=key;
     }
}
class BinarySolution{
     Node root;
     //create a function to enter key/elements
     void InsertKey(char key){
         root=insertInTree(root,key);
     }

     Node insertInTree(Node root,char key){
         if(root==null){
             root=new Node(key);
             return root;
         }
         if(key<root.key){
             root.left=insertInTree(root.left,key);
         }else if(key>root.key){
             root.right=insertInTree(root.right,key);
         }
         return root;
     }
     void preordertraversal(Node root){
         if(root!=null){
             System.out.print(root.key+" ");
             preordertraversal(root.left);
             preordertraversal(root.right);
         }
     }

}
public class BST {
    public static  void main(String args[]){
        BinarySolution t1=new BinarySolution();
        t1.InsertKey('C');
        t1.InsertKey('I');
        t1.InsertKey('B');
        t1.InsertKey('G');
        t1.InsertKey('M');
        t1.InsertKey('A');
        t1.preordertraversal(t1.root);

    }

}
