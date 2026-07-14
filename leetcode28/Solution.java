package leetcode28;
class Solution {
    public int strStr(String haystack, String needle) {
        int i = 0, length = needle.length();
        for(;length <= haystack.length(); i++, length++){
            System.out.println( haystack.subSequence(i, length));
            if(haystack.subSequence(i, length).equals(needle)){
                return i;
            }
            
        }

        return -1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int i = solution.strStr("sadbutsad", "sad");
        System.out.println(i);
    }
}