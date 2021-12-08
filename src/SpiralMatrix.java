import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        int m=3,n=4;
        int k=0,l=0;
        int[][] arr= {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        List<Integer> intList = new ArrayList<>();

        while(k<m && l<n) {
            for(int i=l;i<n;++i){
                intList.add(arr[k][i]);
            }
            k++;
            for(int i=k;i<m;++i) {
                intList.add(arr[i][n-1]);
            }
            n--;
            if(k<m) {
                for(int i=n-1;i>=l;--i) {
                    intList.add(arr[m-1][i]);
                }
                m--;
            }
            if(l<n) {
                for(int i=m-1;i>=k;--i) {
                    intList.add(arr[i][l]);
                }
                l++;
            }
        }

        }
    }
