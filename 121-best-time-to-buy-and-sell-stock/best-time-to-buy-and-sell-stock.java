class Solution {
    public int maxProfit(int[] prices) {
        int min_price = Integer.MAX_VALUE;
        int max_profit = 0;
        int n = prices.length;  
        // int buying_price = prices[0];

        for (int i=0; i<n ;i++){
            int selling_price = prices[i];
            
            if (min_price < selling_price){
                int profit = selling_price - min_price;
                max_profit = Math.max(profit,max_profit);
            }
            else{
                min_price = selling_price;
            }
        }
        return max_profit;
        
    }
}