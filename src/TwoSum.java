import java.util.HashSet;
import java.util.Set;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2,4,5,7,8,9,10};
        int target = 6;
        Set<Integer> result =  new HashSet<>();
        for(int i=0;i<arr.length;i++) {
            int sum = target - arr[i];
            if(result.contains(sum))
                System.out.println("Pair "+  arr[i]+ " " + sum);
            else
                result.add(arr[i]);
        }
    }
}
