class Solution {
    public int maxProfit(int[] prices) {
        int min_price = Integer.MAX_VALUE;
        int max_profit = 0;
        int n = prices.length;  
        int buying_price = prices[0];

        for (int i=1; i<n ;i++){
            min_price = Math.min(buying_price , prices[i]);
            int profit = prices[i] - buying_price;
            buying_price = min_price;
            max_profit = Math.max(max_profit,profit);
        }
        return max_profit;
        
    }
}