package StriversDay1;
/*ou are given an array of prices where prices[i] is the price of a given stock on an ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock. Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.*/
public class StockBuyAndSell {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        int minProfit = prices[0];
        int maxProfit = 0;
        for(int i=1;i<prices.length;i++) {
            minProfit = Math.min(minProfit, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i]-minProfit);
        }
        System.out.println(maxProfit);
    }
}
