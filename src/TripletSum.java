import java.util.HashSet;
import java.util.Set;

public class TripletSum {
    public static void main(String[] args) {
    int[] arr = {-5,2,0,-2,3,5,6};
        for(int i=0;i<arr.length-1;i++) {
            Set<Integer> numberset = new HashSet<>();
            for(int j=i+1;j<arr.length;j++) {
                int x = -(arr[i] + arr[j]);
                if(numberset.contains(x)) {
                    System.out.println("TRIPLET FOUND");
                    System.out.print(x);
                    System.out.print(arr[i]);
                    System.out.print(arr[j]);
                    System.out.println();
                }
                else
                    numberset.add(arr[j]);
            }
        }
    }
}
