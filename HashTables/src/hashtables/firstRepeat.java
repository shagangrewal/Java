package hashtables;
import java.util.HashSet;

public class firstRepeat {
    
    public static int fRepeat(int a[]){
        HashSet<Integer> hs = new HashSet<Integer>();
        int min = -1;
        
        for(int i=a.length-1;i>=0;i--){
            if(hs.contains(a[i]))
                min = i;
            hs.add(a[i]);
        }
        
        return min;
    }
    
    public static void main(String[] args){
        int a[] = {10, 5, 3, 4, 3, 5, 6};
        if(fRepeat(a)==0)
            System.out.println("No Repetition!!");
        else
            System.out.println("The first repeatitive character is with first occurrences: " + a[fRepeat(a)]);
    }
}
