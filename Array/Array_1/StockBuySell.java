package Array_1;

public class StockBuySell {
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,10,4};
        int profit = maxProfit(arr);
        System.out.println(profit);
    }

    public static int maxProfit(int[] prices) {
        int buy = prices[0];
        int profit = 0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<buy){
                buy=prices[i];
            }
            else{
                int currprofit = prices[i]-buy;
                profit = Math.max(currprofit,profit);
            }
        }
        return profit;
    }
}
