package hashtables;
import java.util.HashSet;

public class ProductPair {
    
    public static void pair(int a[], int p){
        HashSet<Integer> hs = new HashSet<Integer>();
        
        for(int i=0;i<a.length;i++){
                
            if(p%a[i]==0){
                if(hs.contains(p/a[i])){
                    System.out.println("Pair: {"+a[i]+","+p/a[i]+"}");
                }
            }
            hs.add(a[i]);
        }
    }
    
    public static void main(String[] args){
        int a[] = {15,10,12,8,17,8,6,20};
        pair(a,120);
    }
    
}
