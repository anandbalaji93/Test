package StriversDay2;

import java.util.Arrays;

public class RotateMatrix {
    public static void main(String[] args) {
        int[][] input = {{1,2,3},{4,5,6},{7,8,9}};
        for(int i=0;i<input.length;i++) {
            for(int j=i+1;j<input.length;j++) {
                    int temp = input[i][j];
                    input[i][j] = input[j][i];
                    input[j][i] = temp;
                }
            }
        for(int i=0;i< input.length;i++) {
           int l=0,r=input.length-1;
           while(l<r)
             {
                int temp = input[i][l];
                input[i][l] = input[i][r];
                input[i][r] = temp;
                l++;
                r--;
            }
        }

       for(int i=0;i<input.length;i++) {
           for(int j=0;j< input.length;j++) {
               System.out.println(input[i][j]);
           }
        }
    }
}
