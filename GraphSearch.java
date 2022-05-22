package com.company;

import java.util.ArrayList;
import java.util.Stack;

public class GraphSearch {
    //Adjacency list is created
    int V;
    ArrayList<Integer>[] adj;
    //constructor
    GraphSearch(int noOfVertex){
        V=noOfVertex;
        adj= new ArrayList[noOfVertex];
        for(int i=0;i<noOfVertex;i++){
            adj[i]= new ArrayList<>();
        }
    }
    //edge/data which are connected to adjacency list
    void edge(int x,int y){
        adj[x].add(y);
    }
    //depthFirstSearch function
    void depthFirstSearch(int sourceVertex) {
        boolean[] visited = new boolean[V];
        Stack<Integer> s1 = new Stack<>();
        s1.push(sourceVertex);
        int node;
        while (!s1.empty()) {
            sourceVertex = s1.peek();
            s1.pop();
            for (int i = 0; i < adj[sourceVertex].size(); i++) {
                node = adj[sourceVertex].get(i);
                if (!visited[node]) {
                    s1.push(node);
                }
            }
            if (visited[sourceVertex] == false) {
                System.out.print(sourceVertex + " ");
                visited[sourceVertex] = true;
            }
        }
    }
    public static void main(String[] args){
        GraphSearch g1=new GraphSearch(6);
        g1.edge(0,1);
        g1.edge(0,2);
        g1.edge(0,5);
        g1.edge(1,0);
        g1.edge(1,2);
        g1.edge(2,1);
        g1.edge(2,0);
        g1.edge(2,3);
        g1.edge(2,4);
        g1.edge(3,2);
        g1.edge(4,2);
        g1.edge(4,5);
        g1.edge(5,0);
        g1.edge(5,4);
        System.out.println("result of depth search");
        g1.depthFirstSearch(0);



    }
}
