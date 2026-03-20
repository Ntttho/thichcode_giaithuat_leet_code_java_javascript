// code153 - find minimum in rotated sorted array

/**
 * @param {number[]} nums
 * @return {number}
 */

var findMin = function (nums) {
    let left = 0, right = nums.length - 1;
    let mid = Math.floor((left + right) / 2);

    while (true) {
        if (nums[mid] > nums[right]) {
            left = mid + 1;
        } else if (nums[mid] < nums[right]) {
            right = mid
        } else if (mid == left && mid == right) {
            return nums[mid];
        }

        mid = Math.floor((left + right) / 2);
    }

};

let nums = [4, 5, 6, 2, 3]
console.log(findMin(nums));

