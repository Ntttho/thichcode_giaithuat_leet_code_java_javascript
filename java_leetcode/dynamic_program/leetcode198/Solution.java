package java_leetcode.dynamic_program.leetcode198;

class Solution {
    public int rob(int[] nums) {
        /*
         * 1,4,3,1 -> 5
         * 1,4,2 -> 4
         * 8,7,2,10 -> 18
         */
        int pre = 0, cur = nums[0], even = 0;
        for (int i = 1; i < nums.length; i++) {
            System.out.println(pre + " " + cur);
            even = Math.max(pre + nums[i], cur);
            pre = cur;
            cur = even;
            // even = Math.max(pre + nums[i], cur);
        }

        return Math.max(even, cur);
    }
}