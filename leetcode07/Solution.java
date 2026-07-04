package leetcode07;

public class Solution {

    public int reverse(int x) {
        int result = 0;
        while (x != 0) {
            result = result * 10 + x % 10;
            x = x / 10;
        }
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.reverse(10);
    }
}
