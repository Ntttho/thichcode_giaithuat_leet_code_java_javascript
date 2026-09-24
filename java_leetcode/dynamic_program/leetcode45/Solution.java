// public int jump(int[] A) {
// 	int jumps = 0, curEnd = 0, curFarthest = 0;
// 	for (int i = 0; i < A.length - 1; i++) {
// 		curFarthest = Math.max(curFarthest, i + A[i]);
// 		if (i == curEnd) {
// 			jumps++;
// 			curEnd = curFarthest;
// 		}
// 	}
// 	return jumps; 
// }

package java_leetcode.dynamic_program.leetcode45;

/**
 * Solution
 */
public class Solution {
   public int jump(int[] nums){
        int result = 1;
        if (nums.length == 1) {
            return 0;
        }
        // 1 1 1 1
        for(int i = 0; i < nums.length - 1; i++){
            if (i + nums[i] >= nums.length - 1) {
                return result;
            }
            int max = 0, jSave = i;
            for(int j = i + 1; j <= i + nums[i]; j++){
                max = Math.max(j + nums[j], max);
                jSave = j;
            }
            if (max == 0) {
                return 0;
            }else{
                i = jSave;
            }
            
            result++;
        }


        return result;
    }


    public static void main(String[] args) {
        
    }
}

/*
My First solution it's so hard, and lower evaluated (underestimate) 
class Solution {
    public int jump(int[] nums) {
        int result = 0;
        int lastIndex = nums.length - 1;
        int dp[] = new int[nums.length];
        if (nums.length == 1) {
            return result;
        }
        for (int i = lastIndex; i >= 0; i--) {
            if (i + nums[i] >= lastIndex) {
                dp[i] = 1;
            } else if (nums[i] == 0) {
                dp[i] = 0;
            } else {
                Integer min = null;

                for (int j = i + 1; j <= i + nums[i] && j < lastIndex; j++) {

                    if (dp[j] != 0) {
                        if (min == null || min >= dp[j]) {
                            min = dp[j];
                            if (min == 1) {
                                break;
                            }
                        }
                    }
                }
                dp[i] = min == null ? 0 : min + 1;

            }
        }
        return dp[0];
    }
}

    */


/*
Gemini gready jumping

class Solution {
    public int jump(int[] nums){
        if (nums.length == 1) {
            return 0;
        }
        int jumps = 0;
        int currentEnd = 0;
        int farthest = 0;
        for(int i = 0; i < nums.length - 1; i++){
            farthest = Math.max(farthest, i + nums[i]);

            if (i == currentEnd) {
                jumps++;
                currentEnd = farthest;
                
                if (currentEnd >= nums.length - 1) {
                    break;
                }
            }
        }


        return jumps;
    }
}



*/