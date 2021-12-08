import javax.crypto.spec.PSource;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6, 7, 8};
        int n = arr.length;
        int lastnumber = arr[n - 1];
        int arraySum = 0;
        int actualSum = 0;
        for (int i = 1; i <= lastnumber; i++) {
            actualSum += i;
        }
        for (int i = 0; i < n; i++) {
            arraySum += arr[i];
        }
        System.out.println("Missing Number is " + (actualSum - arraySum));
    }
}
