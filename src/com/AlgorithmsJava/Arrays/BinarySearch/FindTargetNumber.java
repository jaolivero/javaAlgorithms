package com.AlgorithmsJava.Arrays.BinarySearch;

public class FindTargetNumber {

    //returns index of target.
    public static int search(int[] nums, int target) {
        int ans = nums.length;
        int left = 0;
        int right = ans - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            System.out.println(mid);

            if(nums[mid] == target) return mid;

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
