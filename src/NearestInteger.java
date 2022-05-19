import java.util.HashMap;
import java.util.Map;

public class NearestInteger {
    public static void main(String[] args) {
        int nearest = 11;
        int[] input = {1,2,4,5,6,6,8,9};
        Map<Integer, Integer> resultMap = new HashMap<Integer, Integer>();
        for(int i=0;i<input.length;i++) {
            int diff = Math.abs(nearest-input[i]);
            resultMap.put(diff, input[i]);
        }
        int max = Integer.MAX_VALUE;
        for(Map.Entry<Integer, Integer> result2: resultMap.entrySet()) {
            if(result2.getKey() < max )
                max = result2.getKey();
        }
        System.out.println(resultMap.get(max));
    }
}
