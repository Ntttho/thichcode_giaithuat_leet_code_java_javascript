package leetcode26;

class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int k = 1;
        for (int i = 1; i < nums.length; i++) {
            // 1  1  2
            //    i
            // k-1
            if(nums[i] != nums[k-1]){
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
}