package StriversDay1;

public class SortArrayof0And1 {
    public static void main(String[] args) {
        int[] nums = {1,0};
        int count0 = 0, count1 = 0,count2 = 0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i] == 0)
                count0++;
            else if (nums[i] == 1)
                count1++;
            else
                count2++;
        }
        int i;
        for( i=0;i<count0;++i) {
            nums[i] = 0;
        }
        for(int j=0;j<count1;++j,++i) {
            nums[i] = 1;
        }
        for(int k=0;k<count2;++k,++i) {
            nums[i] = 2;
        }
        for(int m=0;m<nums.length;m++)
            System.out.println(nums[m]);
    }
    }
