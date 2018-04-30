package hashtables;

public class HighestFrequency {
    
    static final int ASCII_SIZE = 256;

    public static char maxFreq(String s){
        int count[]  = new int[ASCII_SIZE];
        
        for(int i=0;i<s.length();i++){
            count[s.charAt(i)]++;
        }
        
        int max = -1;
        char result = ' ';
        
        for(int i=0;i<s.length();i++){
            if(max<count[s.charAt(i)]){
                max = count[s.charAt(i)];
                result = s.charAt(i);
            }
        }
        
        return result;
    }
    
    public static void main(String[] args){
        String s = "Sample String is so simple";
        System.out.println(maxFreq(s));
    }
    
}
