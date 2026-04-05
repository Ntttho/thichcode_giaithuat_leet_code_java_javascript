package leetcode153;

public class Main {
    public static int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        // Vòng lặp chạy cho đến khi left và right hội tụ tại 1 điểm
        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[right]) {
                // Nếu mid > right, điểm nhỏ nhất chắc chắn nằm bên phải mid
                left = mid + 1;
            } else {
                // Nếu mid < right, mid có thể chính là điểm nhỏ nhất hoặc nằm bên trái
                right = mid;
            }
        }

        // Khi left == right, đó chính là giá trị nhỏ nhất
        return nums[left];
    }

    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 2, 3};
        System.out.println("Giá trị nhỏ nhất là: " + findMin(nums));
    }
}
