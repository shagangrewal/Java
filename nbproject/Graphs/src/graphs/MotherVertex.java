package graphs;
import java.io.*;
import java.util.*;

public class MotherVertex {
    
    private static int V;
    private static LinkedList<Integer> adj[];
    
    public MotherVertex(int v){
        V = v;
        adj = new LinkedList[v];
        for(int i=0;i<v;i++){
            adj[i] = new LinkedList();
        }
    }
    
    public static void addEdge(int v, int w){
        adj[v].add(w);
    }
    
    public static void trav(int v , boolean visited[]){
        visited[v] = true;
        Iterator<Integer> i = adj[v].listIterator();
        while(i.hasNext()){
            int n = i.next();
            if(!visited[n])
                trav(n,visited);
        }
    }
    
    public static void findVertex(){
        boolean visited[] = new boolean[V];
        int k=-1;
        for(int i=0;i<V;i++){
            if(!visited[i]){
                trav(i, visited);
                k = i;
            } 
        }
        System.out.println("Mother Vertex at: "+k);
    }   
    
    public static void main(String[] args){
        MotherVertex  g = new MotherVertex(7);
        
        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(1,3);
        g.addEdge(4,1);
        g.addEdge(6,4);
        g.addEdge(5,6);
        g.addEdge(5,2);
        g.addEdge(6,0);
        
        findVertex();
    }
    
}
