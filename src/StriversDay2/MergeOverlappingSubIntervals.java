package StriversDay2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeOverlappingSubIntervals {
    public static void main(String[] args) {
        int[][] arr = {{1,3},{2,6},{8,10},{8,9},{9,11},{15,18},{2,4},{16,17}};
        List<int[]> res = new ArrayList<>();
        if(arr == null || arr.length == 0)
            System.out.println(res.toArray(new int[0][]));
        Arrays.sort(arr, (a,b)->a[0]-b[0]);
        int start = arr[0][0];
        int end = arr[0][1];
        for(int[] i: arr) {
            if(i[0] <=end)
                end = Math.max(end, i[1]);
            else {
                res.add(new int[]{start,end});
                start = i[0];
                end = i[1];
            }
        }
        res.add(new int[]{start,end});
        System.out.println(res.toArray(new int[0][]));
        for(int[] anIntArray:res) {
                System.out.println("Arraylist contains:" + anIntArray[0] + ' ' + anIntArray[1]);
        }
    }
}
