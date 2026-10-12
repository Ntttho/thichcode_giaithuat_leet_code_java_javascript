package java_leetcode.math.leetcode628;

import java.util.Arrays;

class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        // 3 + -> (length - 3 | lenght - 2 | length -1 )
        // 2 + 1 - -> (0 | 1 | length - 1)
        int n = nums.length;
        
        return Math.max(nums[0] * nums[1] * nums[n - 1], nums[n - 3] * nums[n - 2] * nums[n - 1]);
    }
}