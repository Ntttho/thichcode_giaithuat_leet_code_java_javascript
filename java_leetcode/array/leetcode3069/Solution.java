package java_leetcode.array.leetcode3069;

class Solution {
    public int[] resultArray(int[] nums) {

        Integer[] arr1 = new Integer[nums.length], arr2 = new Integer[nums.length];
        int i1 = 1, i2 = 1;
        arr1[i1] = nums[0]; arr2[i2] = nums[1];
        
        for(int i = 2; i < nums.length; i ++){
            if (arr1[i1-1] > arr2[i2-1]) {
                arr1[i1++] = nums[i];
            }else{
                arr2[i2++] = nums[i];
            }
        }
        
        int[] result = new int[nums.length];
        int index = 0;

        for (int i = 0; i < i1; i++) {
            result[index++] = arr1[i];
        }

        for (int i = 0; i < i2; i++) {
            result[index++] = arr2[i];
        }
        

        return result;
    }
}