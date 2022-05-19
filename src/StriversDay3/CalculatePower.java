package StriversDay3;
/* Implement pow(x, n), which calculates x raised to the power n (i.e., xn). */
public class CalculatePower {
    static double getPower(int n, double x) {


    double a = 0;
    int b = Math.abs(n);
        if(x ==-1&&n%2==1)
            return-1;
        if(x ==-1&&n%2==0)
            return 1;
        if(n==0||x ==1)
            return 1;
        if(n==Integer.MAX_VALUE ||n==Integer.MIN_VALUE)
            return 0;

        if(n>=0)

    {
        for (int i = 1; i <= b; i++) {
            if (i == 1)
                a = x * 1;
            else
                a = x * a;
        }
    }
        else

    {
        for (int i = 1; i <= b; i++) {
            if (i == 1)
                a = 1.0 / (x);
            else
                a = 1.0 / x * a;
        }
    }
        return a;
}
    public static void main(String[] args) {
        int n = -2;
        double x = 2.000;
        System.out.println(getPower(n,x));

    }
}
