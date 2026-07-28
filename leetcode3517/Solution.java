package leetcode3517;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class Solution{
    public String smallestPalindrome(String s) {
        String[] strs = s.split("");
        Map<String, Integer> map = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);

        for(String str: strs){
            map.put(str, map.getOrDefault(str, 0) + 1);
        }

        StringBuilder resultString = new StringBuilder("");
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            String string = entry.getKey().repeat(entry.getValue());

            String pre = resultString.substring(0, resultString.length()/2),
            next = resultString.substring(resultString.length()/2);

            String res = pre + string + next;
            resultString = new StringBuilder(res);
        }

        return resultString.toString();
    }

    public String rightSolution(String s){
        int n = s.length();

        char[] half = s.substring(0, n / 2).toCharArray();
        Arrays.sort(half);

        String res =
            new String(half)
            + ((n & 1) == 1 ? s.charAt(n / 2) : "")
            + new StringBuilder(new String(half)).reverse();

        return res;
    }
}
// aabbcccdc -> aabbccccd