package leetcode09;

class Solution {
    public boolean isPalindrome(int x) {
        String[] arr = (x + "").split("");
        int size = arr.length;
        int left = 0, right = size - 1;
        while(left < right){
            if(!arr[left].equals(arr[right])){
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}