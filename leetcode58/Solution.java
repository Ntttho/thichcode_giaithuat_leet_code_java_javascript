package leetcode58;

class Solution {
    public int lengthOfLastWord(String s) {       
        
        String[] strs = s.split(" ");
        return strs[strs.length - 1].length();
    }

    public static void main(String[] args) {
        System.out.println();
    }
}