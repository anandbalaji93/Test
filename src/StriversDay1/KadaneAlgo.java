package StriversDay1;

import java.util.ArrayList;
import java.util.List;

/* Given an integer array arr, find the contiguous subarray (containing at least one number) which
has the largest sum and return its sum and print the subarray.*/
public class KadaneAlgo {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int currSum = 0;
        int maxSum = arr[0];
        List<Integer> subList = new ArrayList<>();
        for(int i=0;i<arr.length;i++) {
            int temp = currSum;
            currSum = currSum + arr[i];
            if(currSum > maxSum)
                maxSum = currSum;
            if(currSum < 0)
                currSum = 0;
        }

        System.out.println(maxSum);
        System.out.println(subList);
    }
}
