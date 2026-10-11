package java_leetcode.math.leetcode2278;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {

    public int sumOfSquares1(int[] nums) {
        int n = nums.length, res = 0;
        for(int i = 1; i < n; i++){
            if(n % i == 0){
                res += Math.pow(nums[i], 2);
            }
        }
        return res;
    }

    public int sumOfSquares(int[] nums) {
        int n = nums.length, res = 0;
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                res += Math.pow(nums[i - 1], 2); // ước i
                if (i != n / i) {
                    res += Math.pow(nums[n/i - 1],2); // ước đối xứng của i qua căn n 
                }
            }
        }
        return res;
    }

    // phát triển từ bài toán (tìm ước của 1 số)
    // cách tôi ưu nhất sẽ có độ phức tạp O(logn)
    public static List<Long> findDivisors(long n) {
        List<Long> divisors = new ArrayList<>();
        // duyệt từ i = 1 đến sqrt(n) (tương đương i * i <= n)
        for (long i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                divisors.add(i); // thêm ước i
                
                // tránh thêm trùng lặp khi n là số chính phương (ví dụ: 6 * 6 = 36)
                if (i != n / i) {
                    divisors.add(n / i); // thêm ước đối xứng
                }
            }
        }
        
        // sắp xếp lại danh sách từ bé đến lớn (tùy chọn)
        Collections.sort(divisors);
        return divisors;
    }

}
