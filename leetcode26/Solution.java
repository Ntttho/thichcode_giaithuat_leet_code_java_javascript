package leetcode26;

class Solution {
    public int removeDuplicates(int[] nums) {
        int nextIndex = 0, preIndex = 1;
        
        for(; nextIndex < nums.length ; nextIndex++){

            if (nums[preIndex] < nums[nextIndex]) {
                preIndex++;
                nums[preIndex] = nums[nextIndex];
            }else{

            }
        }

        for(int i = preIndex+1; i < nums.length; i++){
            nums[i] = 0;
        }

        return preIndex + 1;
    }
}