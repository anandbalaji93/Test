//Ex: [1,2,3,4,3,2,1]. Increasing and then decreasing.
public class MountainArray {
    static void preprocess(int[] arr, int N, int[] left, int[] right) {
        left[0] = 0;
        int lastIncr = 0;
        for(int i=1;i<N;i++) {
            if(arr[i] > arr[i-1])
                lastIncr = i;
            left[i] = lastIncr;
        }
        right[N-1] = N-1;
        int firstDecr = N-1;
        for(int i=N-2;i>=0;i--) {
            if(arr[i] > arr[i+1])
                firstDecr = i;
            right[i] = firstDecr;
        }

    }
    static boolean isSubArrayMountain(int[] arrr, int[] left,int[] right, int L, int R) {
        return (right[L] >= left[R]);
    }
    public static void main(String[] args) {
        MountainArray mt = new MountainArray();
        int[] arr = {2,3,2,4,4,6,3,2};
        int N = arr.length;
        int left[] = new int[N];
        int right[] = new int[N];
        preprocess(arr,N,left,right);
        int L = 0;
        int R = 2;
        System.out.println(isSubArrayMountain(arr, left, right, L, R ));
        int L1 = 1;
        int R1 = 3;
        System.out.println(isSubArrayMountain(arr, left, right, L1, R1 ));

    }
}
