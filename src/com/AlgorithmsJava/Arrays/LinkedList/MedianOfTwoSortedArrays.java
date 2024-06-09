package com.AlgorithmsJava.Arrays.LinkedList;

public class MedianOfTwoSortedArrays {

    //O(log (m+n))


    public double findMedianSortedArrays(int[] nums1, int [] nums2) {
        double median = 0;

        int [] mergedNums = new int[nums1.length + nums2. length];

        int i = 0;
        int j =0;
        int k = 0;


        while(i < nums1.length && j < nums2.length) {

            if(nums1[i] < nums2[j]) {
                mergedNums[k] = nums1[i];
                i++;

            } else {
                mergedNums[k] = nums2[j];
                j++;
            }
            k++;


        }

        while (i <nums1.length) {
            mergedNums[k] = nums1[i];
            i++;
            k++;
        }
        while (i < nums2.length) {
            mergedNums[k] = nums2[j];
            j++;
            k++;
        }


       return median;
    }


}
