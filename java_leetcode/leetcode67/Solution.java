package java_leetcode.leetcode67;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Solution {

    public static String addBinary(String a, String b) {
        Stack<Integer> stackA = new Stack<>();
        Stack<Integer> stackB = new Stack<>();
        Queue<Integer> queueC = new LinkedList<>();
        Stack<String> stackResult = new Stack<>();
        for(String i : a.split("")){
            stackA.add(Integer.parseInt(i));
        }
        for(String i : b.split("")){
            stackB.add(Integer.parseInt(i));
        }
        while (!stackA.isEmpty() || !stackB.empty() || !queueC.isEmpty()) {
            int i = stackA.isEmpty() ? 0 : stackA.pop(), j = stackB.isEmpty()? 0 : stackB.pop(),
                c = queueC.isEmpty() ? 0 : queueC.poll();
            ;

            switch (i + j + c) {
                case 0:
                    stackResult.add("0");
                    break;
                case 1:
                    stackResult.add("1");
                    break;
                case 2:
                    stackResult.add("0");
                    queueC.add(1);
                    break;
                case 3:
                    stackResult.add("1");
                    queueC.add(1);
                    break;
                default:
                    break;
            }
            
        }
        String result = "";
        while (!stackResult.isEmpty()) {
            result+=stackResult.pop();
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(addBinary("11101", "10010"));
    }
}