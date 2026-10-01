package java_leetcode.stack.leetcode1614;

class Solution {
    public int maxDepth(String s) {
        // Stack<String> stackParentheses = new Stack<>();
        int depth = 0; // đếm độ sâu dần thay cho stack
        int maxDepth = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                // stackParentheses.push(s);
                depth++;
            }else if (s.charAt(i) == ')') {
                // stackParentheses.pop();
                depth--;
            }
            
            maxDepth = Math.max(maxDepth, depth);
        }


        return maxDepth;
    }
}