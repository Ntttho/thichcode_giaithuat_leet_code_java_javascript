package leetcode34;

class Solution {
    // chưa tốt nhất
    public int[] searchRange(int[] nums, int target) {
        int length = nums.length;
        int resultLeft = -1, resultRight = -1;
        int start = 0, end = 0;
        while(end < length){
            if(nums[start] != nums[end]){
                start = end;
            }
            if(nums[start] == target){
                resultLeft = start;
            }
            if(nums[end] == target){
                resultRight = end;
            }

            end++;
        }

        return new int[]{resultLeft, resultRight};
    }
}