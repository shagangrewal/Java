package hashtables;
import java.util.HashSet;

public class MissingElements {

    public static void missingEle(int a[], int low, int high){
        HashSet<Integer> hs = new HashSet<Integer>();
        
        for(int i=low;i<=high;i++){
            hs.add(i);
        }
        
        for(int i=0;i<a.length;i++){
            if(hs.contains(a[i]))
                hs.remove(a[i]);
        }
        
        System.out.println(hs);
    }
    
    public static void main(String[] args){
        int a[] = {10,11,12,15};
        missingEle(a,10,21);
    }
    
}
