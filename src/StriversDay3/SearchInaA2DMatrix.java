package StriversDay3;
/*Write an efficient algorithm that searches for a value target in an m x n integer matrix matrix. This matrix has the following properties:

Integers in each row are sorted from left to right.
The first integer of each row is greater than the last integer of the previous row.*/
public class SearchInaA2DMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,3,5,7}, {10,11,16,20}, {23,30,34,60}};
        int  m =matrix.length;
        int j = matrix[0].length-1;
        int target  = 3;
        int i=0;
        boolean a = false;
        while( i< m && j>=0) {
            if(matrix[i][j] == target) {
                a = true;
                break;
            }
            else if (matrix[i][j] > target)
                j--;
            else if(matrix[i][j] < target)
                i++;
        }
        System.out.println(a);
    }
}
