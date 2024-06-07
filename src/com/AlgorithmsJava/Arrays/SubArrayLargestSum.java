package com.AlgorithmsJava.Arrays;

import java.util.Collections;
import java.util.List;

public class SubArrayLargestSum {
    int ArrayMaxConsecutiveSum2(int[] inputArray) {
        int max_sum = inputArray[0];
        int current_sum = max_sum;
        for (int i = 1; i < inputArray.length; i++) {
            current_sum = Math.max(inputArray[i] + current_sum, inputArray[i]);
        }
        return max_sum;
    }

    public static void countSwaps(List<Integer> a) {
        int swaps = 0;
        int loop = 0;

        while(loop <= a.size()){
            for(int i = 0; i < a.size()- 1; i++){
                if(a.get(i) > a.get(i +1)){
                    Collections.swap(a, i, i + 1);
                    swaps += 1;
                }
                //System.out.println(a);
            }
            loop += 1;
        }
        System.out.println("Array is sorted in " + swaps + " swaps.");
        System.out.println("First Element: " + a.get(0));
        System.out.println("Last Element: " + a.get(a.size()-1));
    }

}
