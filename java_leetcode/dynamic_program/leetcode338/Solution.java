package java_leetcode.dynamic_program.leetcode338;

import java.util.List;

class Solution {
    public int[] countBits(int n) {
        int dp[] = new int[n + 1];
        int sub = 1;
        for(int i = 0; i <= n; i++){
            if (sub * 2 == i) {
                sub = i;
            }else{
                dp[i] = dp[i - sub] + 1;
            }
        }


        return dp;
    }
}

/*
i   byte    res
0   0   -> 0
1   1   -> 1
2   10  -> 1
3   11  -> 2
4   100 -> 1 (reset) (res[0] + 1)
5   101 -> 2    (res[1] + 1) <1>
6   110 -> 2    (res[2] + 1) <2>  => từ <1> và <2> suy ra res[4] cái trên là
7   111 -> 3    res[3] + 1
8   tương tự
9
*/