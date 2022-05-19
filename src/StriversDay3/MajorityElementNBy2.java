package StriversDay3;

import java.util.HashMap;
import java.util.Map;

/*Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array*/
public class MajorityElementNBy2 {
    public static void main(String[] args) {
         int[] arr = {3,2,3};
         int n = arr.length;
         int majorityCount = n/2;
         Map<Integer,Integer> resMap = new HashMap<Integer, Integer>();
         for(int i=0;i<n-1;i++) {
             if(resMap.containsKey(arr[i]))
                 resMap.put(arr[i], resMap.get(arr[i]) + 1);
             else
                 resMap.put(arr[i],1);
         }
         for(Map.Entry<Integer,Integer> resultMap: resMap.entrySet()) {
             if(resultMap.getValue() > majorityCount)
                System.out.println(resultMap.getKey());
         }
    }
}