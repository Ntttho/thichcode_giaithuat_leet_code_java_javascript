package java_leetcode.two_pointers.leetcode05;
class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }

        String result = "";
        for(int i = 0; i < s.length(); i++){
            // trường hợp chuổi dx chẳn ký tự
            int odd = expandAroundCenter(s, i, i);
            // trường hợp lẽ ký tự
            int even = expandAroundCenter(s, i, i+1);
            int maxLength = Math.max(odd, even);

            if (maxLength > result.length()) {
                result = s.substring(i - (maxLength-1)/2, i + maxLength/2 + 1);
            }

        }

        return result;
    }

    private int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
}