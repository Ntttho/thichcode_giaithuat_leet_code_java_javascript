package leetcode58;

class Solution {
    public int lengthOfLastWord(String s) {       
        
        String[] strs = s.split(" ");
        return strs[strs.length - 1].length();
    }

    public int lengthOfLastWordBest(String s) {
        s = s.trim();
        
        int length = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                length++;
            }
            else if (length > 0) {
                break;
            }
        }
        
        return length;
    }

    public static void main(String[] args) {
        String str = "hello ae ";
        System.out.println("     hello ae ".contains(" "));
    }
}