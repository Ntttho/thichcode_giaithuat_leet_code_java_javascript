package java_leetcode.dynamic_program.leetcode118;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>(numRows);
        for(int i = 0; i < numRows; i++){
            result.add(i, new ArrayList<>(i + 1));
            for(int j = 0; j <= i; j++){
                if (i == 0 || j == 0 || i == j) {
                    result.get(i).add(1);
                }else{
                    int prev1 = result.get(i - 1).get(j - 1), prev2 = result.get(i - 1).get(j);
                    result.get(i).add(prev1 + prev2);
                }
                
            }
        }

        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        
    }

    /*
        công thức
        F[i][j] = F[i-1][j-1] + F[i-1][j]
    */
}