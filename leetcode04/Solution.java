package leetcode04;

class Solution {
        public double findMedianSortedArrays(int[] nums1, int[] nums2) {


        int[] nums = new int[nums1.length + nums2.length];
        int n = 0;

        int i = 0, j = 0;
        while (i != nums1.length && j != nums2.length) {
            if(nums1[i] <= nums2[j]){
                nums[n++] = nums1[i];
                i++;
            }else{
                nums[n++] = nums2[j];
                j++;
            }
        }

        while (i < nums1.length) {
            nums[n++] = nums1[i++];
        }

        while (j < nums2.length) {
            nums[n++] = nums2[j++];
        }

        // tinh trung vi
        return n % 2 == 0 ? (nums[n/2 - 1] + nums[n/2])/2.0 : nums[n/2];


    }

}