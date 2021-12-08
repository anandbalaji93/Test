import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> secondList = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 0; i < nums.length; i++) {
            int j = i + 1;
            int k = n - 1;
            while (j < k) {
                if (nums[j] + nums[k] == -nums[i]) {
                    List<Integer> firstList = new ArrayList<Integer>();
                    firstList.add(nums[i]);
                    firstList.add(nums[j]);
                    firstList.add(nums[k]);
                    secondList.add(firstList);
                    while (j + 1 < k && nums[j + 1] == nums[j]) {
                        j++;
                    }
                    while (k - 1 > j && nums[k - 1] == nums[k]) {
                        k--;
                    }
                    j++;
                    k--;
                } else if (nums[j] + nums[k] < -nums[i]) j++;
                else k--;
            }
            while (i + 1 < n && nums[i + 1] == nums[i]) i++;
        }
        for (List<Integer> list : secondList) {
            for (int x : list) {
                System.out.println(x);
            }
        }
    }
}
