package com.AlgorithmsJava.BinarySearch;

public class FindTargetNumber {
    public int searchInsert(int[] nums, int target) {
        int ans = nums.length;
        int left = 0, right = ans - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] >= target) {
                right = mid - 1;
                ans = mid;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }
}
