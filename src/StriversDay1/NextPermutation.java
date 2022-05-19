package StriversDay1;
/*Given an array Arr[] of integers, rearrange the numbers of the given array into the lexicographically next greater permutation of numbers.*/
public class NextPermutation {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int index1 = 0;
        int index2 = 0;
        for (int i = nums.length-2;i>=0; i--) {
            if (nums[i] < nums[i + 1]) {
                index1 = i;
            }
            if (nums[i] > nums[i + 1]) {
                index2 = i;
            }
        }
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
        int j = nums.length - 1;
        while (index1 + 1 < j) {
            int temp1 = nums[index1 + 1];
            nums[index1 + 1] = nums[j];
            nums[j] = temp1;
            j--;
        }
        System.out.println(nums[0]);
        System.out.println(nums[1]);
        System.out.println(nums[2]);    }
}