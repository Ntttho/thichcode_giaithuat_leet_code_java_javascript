package java_leetcode.array.leetcode856;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int scoreOfParentheses(String s) {
        List<Integer> list = new ArrayList<>();
        int checkP = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                checkP++;
                list.add(1);
            } else {
                checkP--;
            }
            
            if (s.charAt(i) == ')') {

            }
        }
        

        list.clear();
        int depth = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                depth++;
                list.add(2);
            } else {
                depth--;
                list.add(1);
            }
        }
        
        return calculateScore(s);
    }
    
    private int calculateScore(String s) {
        int scope = 0;
        int checkPD = 1;
        int sum = 0;
        

        int depth = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                depth++;
            } else {
                depth--;
                if (s.charAt(i - 1) == '(') {
                    scope += (1 << depth);
                }
            }
        }
        return scope;
    }
}