package graphs;
import java.io.*;
import java.util.*;

class BFS {
    
    private static int V;
    private static LinkedList<Integer> adj[];
    
    BFS(int v){
        V = v;
        adj = new LinkedList[v];
        for(int i=0;i<v;i++){
            adj[i] = new LinkedList();
        }
    }
    
    void addEdge(int v, int w){
        adj[v].add(w);
    }
    
    public static void bfSearch(int s){ //s is the source node
        boolean visited[] = new boolean[V];
       
        LinkedList<Integer> queue = new LinkedList<Integer>();
        visited[s] = true;
        queue.add(s);
        
        while(queue.size() != 0){
            s = queue.poll();
            System.out.print(s+" ");
            
            Iterator<Integer> i = adj[s].listIterator();
            while(i.hasNext()){
                int n = i.next();
                if(!visited[n]){
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
        
    }
    
    public static void main(String[] args){
        BFS g = new BFS(5);
        
        g.addEdge(0,1);
        g.addEdge(1,0);
        g.addEdge(1,2);
        g.addEdge(2,3);
        g.addEdge(3,4);
        
        System.out.println("BFS traversal starting at Node 1:");
        bfSearch(1);
    }
}
