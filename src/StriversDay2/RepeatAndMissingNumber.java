package StriversDay2;
/*You are given a read only array of n integers from 1 to n.

Each integer appears exactly once except A which appears twice and B which is missing.

Return A and B.
Note that in your output A should precede B.

Example:

Input:[3 1 2 5 3]

Output:[3, 4]

A = 3, B = 4
*/
public class RepeatAndMissingNumber {
    public static void main(String[] args) {
       int[] nums = {3,1,2,5,3};
       for(int i=0;i<nums.length;i++) {
           int abs_val = Math.abs(nums[i]);
           if(nums[abs_val-1]>0)
               nums[abs_val-1] = -nums[abs_val-1];
           else
               System.out.println("Repeated Value" + abs_val);

       }
       for(int i=0;i<nums.length;i++) {
           System.out.println(nums[i]);
        if (nums[i] > 0)
               System.out.println(i+1);
       }
    }
    }
