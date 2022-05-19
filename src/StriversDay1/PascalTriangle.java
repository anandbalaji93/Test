package StriversDay1;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args) {
        int numRows = 5;
        List<List<Integer>> result = new ArrayList<List<Integer>>(numRows);
        List<Integer> individualList = new ArrayList<>();

        for(int i=0;i<numRows;i++) {
            List<Integer> tempList = new ArrayList<>();
            for(int j=0;j<=i;j++) {
                if(j==0 || j==i)
                   tempList.add(1);
               else
                    tempList.add(j, (individualList.get(j-1) + individualList.get(j)));
           }
            individualList = tempList;
            result.add(tempList);
        }

        System.out.println(result);
    }
}
