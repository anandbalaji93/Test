import java.util.HashMap;
import java.util.Map;

public class UniqueWordsInStringArray {
    public static void main(String[] args) {
        String str[] = {"Hello", "Dello", "Bello","Cello","Trello","Hello","Bello"};
        Map<String, Integer>  result= new HashMap<>();
        int uniqueCount  = 0;

        for(int i = 0;i<str.length;i++) {
            if(result.containsKey(str[i]))
                continue;
            else {
                result.put(str[i], 1);
                uniqueCount++;
            }

        }
        System.out.println("No of unique words in string array "+ uniqueCount);
    }
}
