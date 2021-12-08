import java.util.HashSet;
import java.util.Set;

public class FindPair {
    public static void main(String[] args) {
        int [] arr = {10,20,9,40};
        int x = 400;
        Set<Integer> result =  new HashSet<>();
        for(int i=0;i<arr.length;i++) {
            if(arr[i] == 0)
                continue;
            if(x % arr[i] == 0)
            {   result.add(x/arr[i]);
                if(result.contains(arr[i]))
                    System.out.println("Pair with the multiple value" + arr[i] + x/arr[i]);

            }
        }
    }
}
