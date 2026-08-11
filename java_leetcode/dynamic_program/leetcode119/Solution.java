package java_leetcode.dynamic_program.leetcode119;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> getRow(int rowIndex) {
        ArrayList<Integer> result = new ArrayList<>(rowIndex + 1); // first row have rowIndex = 0
        for (int i = 0; i <= rowIndex; i++) {
            // Bước 1: Thêm phần tử cuối (luôn là 1) để tăng size()
            result.add(1);
            
            // Bước 2: Duyệt NGƯỢC từ (i - 1) về 1 để cập nhật các ô ở giữa
            for (int j = i - 1; j > 0; j--) {
                int newVal = result.get(j) + result.get(j - 1);
                result.set(j, newVal); // Lúc này j < size() nên set() an toàn
            }
        }

        return result;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.getRow(3));
    }
}
