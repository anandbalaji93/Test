package StriversDay2;

public class DuplicateInArrayOfNPlusOneInt {
    public static void main(String[] args) {
        int[] nums = {1,3,4,2,2};
        for(int i=0;i<nums.length;i++) {
            int abs_val = Math.abs(nums[i]);
            if(nums[abs_val-1] > 0)
                nums[abs_val-1] = -nums[abs_val-1];
            else
            System.out.println(abs_val);
        }
    }
}
