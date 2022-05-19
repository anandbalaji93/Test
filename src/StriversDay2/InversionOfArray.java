package StriversDay2;
/*Given an array of N integers, count the inversion of the array (using merge-sort).

What is an inversion of an array?
Definition: for all i & j < size of array, if i < j
then you have to find pair (A[i],A[j]) such that A[j] < A[i].

Input Format: N = 5, array[] = {1,2,3,4,5}

Result: 0

Input Format: N = 5, array[] = {5,4,3,2,1}

Result: 10

Explanation: we have a reverse sorted array and we will
get the maximum inversions as for i < j we will always
find a pair such that A[j] < A[i].
Example: 5 has index 0 and 3 has index 2 now (5,3) pair
is inversion as 0 < 2 and 5 > 3 which will satisfy out
conditions and for reverse sorted array we will get
maximum inversions and that is (n)*(n-1) / 2.

For above given array there is 4 + 3 + 2 + 1 = 10 inversions.

Input Format: N = 5, array[] = {5,3,2,1,4}

Result: 8

Explanation: There are 7 pairs (5,1), (5,3), (5,2), (5,4),
(3,2), (3,1), (2,1) and we have left 2 pairs (2,4) and
(1,4) as both are not satisfy our condition.
*/

public class InversionOfArray {
    static int _mergesort(int[] arr, int[] temp, int left, int right) {
        int mid, inv_count = 0;
        if(right > left) {
            mid = (right+left)/2;
            inv_count += _mergesort(arr,temp,left,mid);
            inv_count += _mergesort(arr,temp,mid+1,right);

            inv_count += _merge(arr,temp,left,mid+1,right);
        }
        return inv_count;
    }

    static int _merge(int[] arr, int[] temp, int left, int mid, int right) {
        int i,j,k; //i is index for left sub-array, j is index for right sub-array,k is index for resultant merged sub-array
        int inv_count  = 0;
        i = left;
        j = mid;
        k=left;

        while((i<=mid-1) && (j<=right)) {
            if(arr[i] <= arr[j])
            temp[k++] = arr[i++];
            else{
                temp[k++] = arr[j++];
                inv_count += (mid - i);
            }
        }

        while(i<=mid-1)
            temp[k++] = arr[i++];
        while(j<=right)
            temp[k++] = arr[j++];


        for(i = left; i<=right; i++) {
            arr[i] = temp[i];
        }
      return inv_count;
    }

public static void main (String[] args) {
    int[] arr = {5,3,2,4,1};
    int n = arr.length;
    int [] temp = new int [n];
    int ans = _mergesort(arr,temp,0,n-1);
    System.out.println("Count of inversions of array: " + ans);
}
}
