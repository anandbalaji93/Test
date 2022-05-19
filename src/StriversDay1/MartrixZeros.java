package StriversDay1;
/*Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.*/
public class MartrixZeros {
    public static void  main(String[] args) {
        int[][] matrix = {{1,1,1}, {1,0,1}, {1,1,1}};
        int rows = matrix.length;;
        int cols = matrix[0].length;
        int[] dummy1 = new int[rows];
        int[] dummy2 = new int[cols];

        for(int i=0;i<rows;i++) {
            dummy1[i] = -1;
        }

        for(int j=0;j<cols;j++) {
            dummy2[j] = -1;
        }

        for(int i=0;i<rows;i++) {
            for(int j=0;j<cols;j++) {
                if(matrix[i][j] == 0) {
                    dummy1[i] = 0;
                    dummy2[j] = 0;
                }
            }
        }

        for(int i=0;i<rows;i++) {
            for(int j=0;j<cols;j++) {
                if(dummy1[i] == 0 || dummy2[j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        for(int i=0;i<rows;i++) {
            for(int j=0;j<cols;j++) {
                System.out.println(matrix[i][j]);
            }
        }

    }
}
