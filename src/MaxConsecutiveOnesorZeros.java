public class MaxConsecutiveOnesorZeros {

    public static void main(String[] args) {
        int[] arr  = {1,1,1,0,0,0,1,0,1,0,1,1,1,1,1,1,1,0,0,0,0,0,1,1,1,1,1,1,0,0,0,0,0,0,0,0,1,0,0,1,0,1};
        int maxOnes  = 0;
        int count = 0;
        for(int i=0;i<arr.length;i++) {
            if(arr[i] == 1)
                count = 0;
            else {
                count++;
                maxOnes = Math.max(count, maxOnes);
            }
        }
        System.out.println(maxOnes);
    }
}
