public class best_time_to_buy_and_sell_stock_121 {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }
            if (prices[i] - minPrice > maxProfit) {
                maxProfit = prices[i] - minPrice;
            }
        }
        return maxProfit;
    }
//    public int maxProfit(int[] prices) {
//        int buyPrice = prices[0];
//        int profit = 0;
//
//        for (int i = 1; i < prices.length; i++) {
//            if (buyPrice > prices[i]) {
//                buyPrice = prices[i];
//            }
//
//            profit = Math.max(profit, prices[i] - buyPrice);
//        }
//
//        return profit;
//    }
}
