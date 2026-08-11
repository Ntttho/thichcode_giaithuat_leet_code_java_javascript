package java_leetcode.dynamic_program.leetcode70;

public class Solution {
    public int climbStairs(int n) {
        int[] memo = new int[n + 1];
        return mathClimbStairs(n, memo);
    }

    public int mathClimbStairs(int n, int[] memo){
        if (n <= 2) {
            return n;
        }
        if(memo[n] != 0){
            return memo[n];
        }
        memo[n] = mathClimbStairs(n - 2, memo) + mathClimbStairs(n - 1, memo);
        return memo[n];

    }


}
