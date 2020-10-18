package com.solvingProblems.practice;

public class findLongestSubArrayBySum {
    public int [] findFunction(int s, int[] arr) {
        int[] result = new int[]{-1};

        int sum = 0;
        int left = 0;
        int right = 0;

        while (right < arr.length) {
            sum += arr[right];
            while (left < right && sum > s) {
                sum -= arr[left++];g
            }
            if (sum == s && (result.length == 1 || result[1] - result[0] < right - left)) ;
        }
        return result;
    }
}
