package java_leetcode.dynamic_program.leetcode55;

public class Solution {
    public boolean canJump(int[] nums) {
        /*
         * jumping i = i + nums[i] ---> lastindex  -> true
         * jumpint from first index i = 0, jump nums[i] steps until lastindex -> true else false
        */
        if(nums.length == 1){
            return true;
        }
        int lastIndex = nums.length - 1;
        boolean dp[] = new boolean[nums.length];
        // o(nlogn)
        for(int i = lastIndex; i >= 0; i--){
            if (nums[i] == 0) {
                dp[i] = false;
            }else if(i + nums[i] >= lastIndex){
                dp[i] = true;
            }else{
                for(int j = i + 1; j <= nums[i] + i; j++){
                    if (dp[j]) {
                        dp[i] = true;
                        continue;
                    }
                }
            }
        }
        
        for(boolean b : dp){
            System.out.println(b);
        }
        
        return dp[0];

        // nhay max_gas
        // int maxReach = 0;
        // for(int i = 0; i <= nums.length; i++){
        //     if (i > maxReach) {
        //         return false;
        //     }
        //     maxReach = Math.max(maxReach, i + nums[i]);
        // }

        // return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1,0,3,0,0,0,2};
        System.out.println(solution.canJump(nums));
    }
}

