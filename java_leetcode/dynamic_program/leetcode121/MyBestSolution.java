package java_leetcode.dynamic_program.leetcode121;

public class MyBestSolution {
    public int maxProfit(int[] prices) {
        int maxSellPoint = 0;
        int[] profitAtBuyPoint = new int[prices.length];
        for(int i = prices.length - 1; i >= 0; i-- ){
            profitAtBuyPoint[i] = maxSellPoint - prices[i];
            maxSellPoint = Math.max(maxSellPoint, prices[i]);
        }
        
        int max = 0;
        for(int i : profitAtBuyPoint){
            max = Math.max(i, max);
        }

        return max;
    }
}
