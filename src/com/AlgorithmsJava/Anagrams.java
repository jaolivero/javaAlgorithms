package com.AlgorithmsJava;

import java.util.HashMap;
import java.util.Map;

public class Anagrams {
    static public long totalAnagrams(String str) {
        int total = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            map.merge(c, 1, Integer::sum);
        }

        for(Map.Entry let: map.entrySet() ) {

            total += (Integer) let.getValue();
        }

        System.out.println(total);
        System.out.println(map);
        return total;
    }

    public static long solution(String s) {
        String str = " ";
        int max = 0;

        for (char c: s.toCharArray()) {
            String current = String.valueOf(c);
            if(str.contains(current)) {
                str = str.substring(str.indexOf(current) + 1);
            }
            str = str + String.valueOf(c);
            max = Math.max(str.length(), max);
        }
        return max;
    }

}
