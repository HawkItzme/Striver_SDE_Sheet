package Arrays;

public class StockBuyAndSell {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
    public static int maxProfit(int[] prices) {
        int minP = Integer.MAX_VALUE;
        int maxprofit = 0;
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < minP){
                minP = prices[i];
            }else if(prices[i] - minP > maxprofit)
                maxprofit = prices[i] - minP;
        }
        return maxprofit;
    }
}
