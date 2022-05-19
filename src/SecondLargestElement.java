public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = {2,1,3,5,6,7,8,12,11};
        int largest = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++) {
            if(arr[i] > largest)
                largest = arr[i];
        }
        for(int i=0;i<arr.length;i++) {
            if(arr[i]!=largest) {
                if(arr[i] > secondlargest)
                    secondlargest = arr[i];

            }
        }

        System.out.println(secondlargest);
    }
}
