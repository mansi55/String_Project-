import java.util.HashMap;
import java.util.Map;

public class FindDuplicates {
    public static void main(String[] args) {
        String Str ="helloworld";
        Map<Character,Integer> charCount = new HashMap<>();
        for(char c: Str.toCharArray()){
            if(charCount.containsKey(c)){
                charCount.put(c, charCount.get(c)+1);
            }else{
                charCount.put(c,1);
            }
        }
        // find the char with highest occurance
        char maxChar = ' ';
        int max = 0;
        for(Map.Entry<Character,Integer> entry :charCount.entrySet()){
            if(entry.getValue() > max){
                maxChar = entry.getKey();
                max = entry.getValue();

            }
        }
        System.out.println("Highest occurring letter: " + maxChar + " and occurrence: " + max);
    }
    
}
