package hashtables;
import java.util.*;

public class HashTables {

    public static void main(String[] args) {
        System.out.println("Basic HashMap Program!!!");
        
        Hashtable h = new Hashtable(10);
        
        h.put("A",99);
        h.put("B",82);
        h.put("C",71);
        h.put("D",69);
        h.put("E",51);
        h.put("F",1);
        
        Enumeration e = h.elements();
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
        System.out.println(h.size());
        System.out.println(h.remove("b"));
    }
    
}
