package java_leetcode.dynamic_program.leetcode121;
class Solution {
    public int maxProfit(int[] prices) {
        if(checkDecreatementArray(prices)){
            return 0;
        }

        int[] dp = new int[prices.length+1];
        System.out.println(dp);

        int maxProfit = 0;
        for(int i = 0; i < prices.length; i++){
            int maxSellBehind = maxProfitBehind(i, prices);
            maxProfit = Math.max(maxProfit, maxSellBehind - prices[i]);
        }
        
        return maxProfit;
    }

    // result method
    public int maxProfitBehind(int index, int[] prices){
        int maxSell = prices[index];
        for(int i = index; i < prices.length; i++){
            maxSell = Math.max(maxSell, prices[i]);
        }
        return maxSell;
    }

    // check day giam
    public boolean checkDecreatementArray(int[] array){
        for(int i = 0; i < array.length - 1; i++){
            if (array[i] < array[i+1]) {
                return false;
            }
        }

        return true;
    }

}