public class SumWithoutOperator {
    public int getSum(int x, int y) {
        if(y ==0)
            return -1;
        while(y!=0) {
            int carry = x & y;
            x = x ^ y;
            y= carry << 1;
        }

        return x;


    }
    public static void main(String[] args) {
        SumWithoutOperator sumWithoutOperator =  new SumWithoutOperator();
        System.out.println(sumWithoutOperator.getSum(2,3));

    }
}
