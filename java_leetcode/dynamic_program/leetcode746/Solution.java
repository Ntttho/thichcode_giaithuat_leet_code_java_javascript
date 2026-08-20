package java_leetcode.dynamic_program.leetcode746;

class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length];

        for(int i = cost.length - 1; i != 0; i--){
            

            if(i >= cost.length - 2){
                dp[i] = cost[i];
            }else{
                // min to result
                
                dp[i] = cost[i] + Math.min(dp[i + 1], dp[i + 2]);
            }

        }


        return Math.min(dp[0], dp[1]);
    }

    public int minCostClimbingStairsRecursion(int[] cost){
        int n = cost.length;
        for(int i = 2; i < n; i++){

        }

        return 1;
    }
    
}

class Solution2 {
    public int minCostClimbingStairs(int[] cost) {

        int prev1 = cost[0], prev2 = 0, current = 0;
        for(int i = 1; i < cost.length; i++){
            current = Math.min(prev2+cost[i],prev1+cost[i + 1]);
            prev2 = prev1;
            prev1 = current;
        }
        

        return Math.min(prev2, prev1);
    }
}

class BestSolution {
    public int minCostClimbingStairs(int[] cost) {

        int prev=cost[0],prev2=0,current;
        for(int i=1;i<cost.length;i++){
            current=Math.min(prev2+cost[i],prev+cost[i]);
            prev2=prev;
            prev=current;
            System.out.println(prev + " " + prev2);
        }
        
        return Math.min(prev,prev2);
        // [1, 100, 1, ]

    }
}