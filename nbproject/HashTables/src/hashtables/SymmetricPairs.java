package hashtables;
import java.util.Hashtable;


public class SymmetricPairs {
    
    public static void symm_pair(int a[][]){
        Hashtable<Integer, Integer> ht = new Hashtable<Integer, Integer>();
        
        for(int i=0;i<a.length;i++){
            
            int first = a[i][0];
            int sec = a[i][1];
            
            Integer val = ht.get(sec);
            if(val != null && val==first){
                System.out.println("The symmteric pair exists in the array with pair being: {"+first+","+sec+"}");
            }
            else{
                ht.put(first,sec);
            }
        }
    }
    
    public static void main(String[] args){
        int a[][] = new int[5][2];
        
        a[0][0] = 11;
        a[0][1]=20;
        
        a[1][0] = 30;
        a[1][1]=40;
        
        a[2][0] = 5;
        a[2][1]=10;
        
        a[3][0] = 40;
        a[3][1]=30;
        
        a[4][0] = 10;
        a[4][1]=5;
        symm_pair(a);
        
    }
    
}
