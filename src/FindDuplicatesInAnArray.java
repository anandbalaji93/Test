import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindDuplicatesInAnArray {
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 6, 1, 3, 4, 4, 5, 6};
        //approach1-using collections
        Map<Integer,Integer> result =  new HashMap<>();
        for(int i=0;i<arr.length;i++) {
            if(result.containsKey(arr[i]))
                result.put(arr[i], result.get(arr[i])+1);
            else
                result.put(arr[i],1);
        }
        for(Map.Entry<Integer, Integer> duplicates: result.entrySet()) {
            if(duplicates.getValue()>1)
                System.out.println(duplicates.getKey());
        }

        //without collections
        Set<Integer> resultSet = new HashSet<>();
        for(int i=0;i<arr.length;i++) {
            for(int j=i+1; j< arr.length;j++) {
                if(arr[i] == arr[j] && !resultSet.contains(arr[i])){
                System.out.println("Duplicate Found " + arr[i]);
                resultSet.add(arr[i]);
            }
            }
        }
    }
}
