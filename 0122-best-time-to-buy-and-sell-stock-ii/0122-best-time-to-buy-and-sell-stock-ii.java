class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0 ;
        for(int i = prices.length - 1; i >=1 ; i--){
            int j = i - 1 ;

          if(prices[i] - prices[j] > 0) {

           profit += prices[i] - prices[j] ;

          }

        }
        if(profit > 0 ) return profit ;

       else 
       
       return 0 ;
    }
}