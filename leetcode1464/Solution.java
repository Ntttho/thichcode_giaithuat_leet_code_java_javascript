package leetcode1464;

public class Solution {
    public int maxProduct(int[] nums) {
        int max1 = 0, indexMax1 = 0, max2 = 0;
        for(int i = 0; i < nums.length; i++){
            if(max1 < nums[i]){
                max1 = nums[i];
                indexMax1 = i;
            }
        }
        for(int i = 0; i < nums.length; i++){
            if(max2 < nums[i] && i != indexMax1){
                max2 = nums[i];
            }
        }

        return (max1 - 1) * (max2 - 1);
    }
    // basic
}
