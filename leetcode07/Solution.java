package leetcode07;

public class Solution {

    public int reverse(int x) {
        long result = 0;
        while (x != 0) {
            result = result * 10 + x % 10;
            x = x / 10;
        }
        // incase x = 1534236469 // that is crazy for the size of this dataType
        if(result > Integer.MAX_VALUE || result<Integer.MIN_VALUE){
            return 0;
        }
        return (int)result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.reverse(10);
    }
}
