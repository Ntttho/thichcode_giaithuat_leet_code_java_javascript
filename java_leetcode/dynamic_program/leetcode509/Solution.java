package java_leetcode.dynamic_program.leetcode509;

class Solution {
    public int fib(int n) {
        if(n < 2){
            return n;
        }
        int[] memo = new int[n + 1];
        return fib(n, memo);
    }

    private int fib(int n, int[] memo){
        if(n < 2){
            return n;
        }
        if(memo[n] != 0){
            return memo[n];
        }
        memo[n] = fib(n-1, memo) + fib(n-2, memo);
        return memo[n];
    }
}