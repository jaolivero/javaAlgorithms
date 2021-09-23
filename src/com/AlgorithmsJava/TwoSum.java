package com.AlgorithmsJava;

import java.util.HashMap;

public class  TwoSum {
    public static int[] answer (int [] num, int target){
        HashMap<Integer, Integer> map = new HashMap();

        for(int i = 0; i < num.length; i++) {
            int difference = target - num[i];
            if(map.containsKey(difference)) {
                return new int[] { i, map.get(difference) };
            }
            map.put(num[i], i);
        }
        return new int[] { -1, -1};
    }
}
