package hashmaps;
import java.util.HashMap;

public class HashMaps {
    
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        HashMap<String, Integer> hm2 = new HashMap<String, Integer>();
        
        hm.put("A",99);
        hm.put("B",67);
        hm.put("C",34);
        hm.put("D",55);
        hm.put("E",49);
        
        System.out.println(hm.hashCode());
        
    }
    
}
