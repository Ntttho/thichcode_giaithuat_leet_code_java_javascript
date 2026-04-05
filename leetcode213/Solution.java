package leetcode213;
class Solution {
   public int rob(int[] nums) {

        if(nums.length == 1){
            return nums[0];
        }

        int cur1= 0, pre1 = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            int temp = maxIn(nums[i] + pre1, cur1);
            pre1 = cur1;
            cur1 = temp;
        }

        int cur2 = 0, pre2 = 0;
        for (int i = 1; i < nums.length; i++) {
            int temp = maxIn(nums[i] + pre2, cur2);
            pre2 = cur2;
            cur2 = temp;
        }

        return maxIn(cur2, cur1);
    }

    public static int maxIn(int a, int b){
        return a > b ? a : b;
    }

    public static void main(String[] args) {
        System.out.println("Check");
    }
}