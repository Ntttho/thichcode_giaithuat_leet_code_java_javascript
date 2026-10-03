package java_leetcode.array.leetcode15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*
    - Sử dụng two poiter
---
Thường các bài toán two poiter sẽ quản lý 2 con trỏ đầu và cuối
- và thường sẽ sử dụng vào các dạng lập trình với danh sách có sự sắp xếp
- Bài toán 3Sum leetcode 15 dạng này
*/

// three sum
// sử dụng kỹ thuật 2 con trỏ
public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> threeSum = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            // lặp bỏ cho hết các trường hợp bằng nhau
            // vd: 0 1 1 1 -> khi i ở vị trí 1 -> trong trường hợp có -2 ở đằng sau mảng thì sẽ chỉ tính 1 lần (lặp lại 1 - 1 lần duy nhất)
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int j = i + 1, k = nums.length - 1;

            while(j < k){
                int total = nums[i] + nums[j] + nums[k];
                if (total > 0) {
                    k--;
                } else if (total < 0) {
                    j++;
                } else {
                    threeSum.add(List.of(nums[i], nums[j], nums[k]));
                    j++;
                    // lặp bỏ qua tất cả trường hợp số trùng tại vị trí j (tương tự i ở trên)
                    while (nums[j] == nums[j - 1] && j < k) {
                        j++;
                    }
                }
            }

        }





        return threeSum;
    }
}
