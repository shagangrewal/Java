package hashtables;
import java.util.HashSet;

public class PairSum {
    
    public static void sumPair(int a[], int sum){
        HashSet<Integer> hs = new HashSet<Integer>();
        
        for(int i=0;i<a.length;i++){
            int temp = sum - a[i];
            
            if(temp >=0 && hs.contains(temp)){
                System.out.println("Pair: {"+a[i]+","+temp+"}");
            }
            hs.add(a[i]);
        }
    }
    
    public static void main(String[] args){
        int a[] = {10,12,45,1,30,28,15,25};
        sumPair(a,40);
    }
    
}
