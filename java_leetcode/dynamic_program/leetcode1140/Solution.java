package java_leetcode.dynamic_program.leetcode1140;

import java.util.Arrays;

/**
 * Solution
 */
public class Solution {

    public int stoneGameII(int[] piles) {
        int[] suffixSum = Arrays.copyOf(piles, piles.length);

        for (int i = suffixSum.length - 2; i >= 0; i--) {
            suffixSum[i] += suffixSum[i + 1];
        }

        return 1;
    }

    public int maxStone(int[] piles, int miss, int M){

        return 1;
    }

    // update M = Max(M, X)
    // get by index and pass one more index
    // 
}

