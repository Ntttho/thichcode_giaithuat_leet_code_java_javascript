package java_leetcode.dynamic_program.leetcode22;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> generateParenthesis1(int n) {
        List<String> result = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                String paralet = "()";
                result.add(paralet);
            }
        }
        return result;
        /*
         * explain
         * n = 1 -> ()
         * n = 2 -> từ n = 1 triển khai lên -> (()) & ()() (ngoặc trong ngoặc ngoài ở
         * các vị trí)
         * n = 3 -> từ n = 2 triển khai lên
         * ()() -> ()()() && (()())
         * (()) -> (()()) && (())() && ()(())
         * n = 4 -> từ n = 3 lên
         * ()()()
         */
    }

    // chôm solution
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<String>();
        generateOneByOne("", list, n, n);
        return list;
    }

    public void generateOneByOne(String sublist, List<String> list, int left, int right) {
        if (left > right) {
            return;
        }
        if (left > 0) {
            generateOneByOne(sublist + "(", list, left - 1, right);
        }
        if (right > 0) {
            generateOneByOne(sublist + ")", list, left, right - 1);
        }
        if (left == 0 && right == 0) {
            list.add(sublist);
            return;
        }
    }

    public static void main(String[] args) {

    }
}