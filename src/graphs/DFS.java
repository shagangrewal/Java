package graphs;
import java.util.*;
import java.io.*;

public class DFS {
    private static int V;
    private static LinkedList<Integer> adj[];
    
    public DFS(int v){
        V = v;
        adj = new LinkedList[v];
        for(int i=0;i<v;i++){
            adj[i] = new LinkedList();
        }
    }
    
    public static void addEdge(int v , int w){
        adj[v].add(w);
    }
    
    public static void dfsTrav(int s, boolean visited[]){
        visited[s] = true;
        System.out.print(s+"  ");
        
        Iterator<Integer> i = adj[s].listIterator();
        while(i.hasNext()){
            int n = i.next();
            if(!visited[n])
                dfsTrav(n, visited);
        }
    }
    
    public static void dfs(int s){
        boolean visited[] = new boolean[V];
        
        dfsTrav(s,visited);
    }
    
    public static void main(String[] args){
        DFS g = new DFS(5);
        
        g.addEdge(0,1);
        g.addEdge(1,0);
        g.addEdge(1,2);
        g.addEdge(2,3);
        g.addEdge(3,4);
        
        dfs(1);
    }
}
