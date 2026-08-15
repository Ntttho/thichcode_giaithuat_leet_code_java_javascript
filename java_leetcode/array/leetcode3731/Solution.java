package java_leetcode.array.leetcode3731;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> result = new ArrayList<Integer>();
        List<Integer> checkExist = new ArrayList<Integer>();

        // find the min max
        int min = nums[0]; int max = nums[0];
        for(int i = 0 ; i<nums.length; i++){
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
            checkExist.add(nums[i]);
        }

        for(int i = min; i<max; i++){
            if(!checkExist.contains(i)){
                result.add(i);
            }
        }

        System.out.println(min + " " + max + " " + result);
        
        result.sort((o1, o2) -> o1 - o2);
        return result;
    }

    
}
