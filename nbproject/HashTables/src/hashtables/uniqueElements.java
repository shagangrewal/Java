package hashtables;
import java.util.HashSet;

public class uniqueElements {
    public static void uniqEle(int a[]){
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int i=0;i<a.length;i++){
            if(!hs.contains(a[i]))
                hs.add(a[i]);
        }
        
        System.out.println("Unique elements in the array: "+hs);
    }
    
    public static void main(String[] args){
        int a[] = {12, 10, 9, 45, 2, 10, 10, 45};
        uniqEle(a);
    }
}
