package leetcode20;

import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {
        String[] parentheses = s.split("");
        Stack<String> stack = new Stack<>();
        int index = 0;
        while (index < parentheses.length) {
            String paremthese = parentheses[index];
            if(paremthese.equals("(") || paremthese.equals("[")  || paremthese.equals("{") )
                stack.add(paremthese);
            else
                switch (parentheses[index]) {
                    case ")":
                        if(stack.isEmpty()) return false;
                        else if(stack.peek().equals("(")) stack.pop(); 
                        else return false;
                        break;
                    case "]":
                        if(stack.isEmpty()) return false;
                        else if(stack.peek().equals("[")) stack.pop(); 
                        else return false;
                        break;
                    case "}":
                        if(stack.isEmpty()) return false;
                        else if(stack.peek().equals("{")) stack.pop(); 
                        else return false;
                        break;
                    default:
                        return false;
                }


            index++;
        }

        return stack.isEmpty();
    }
}
