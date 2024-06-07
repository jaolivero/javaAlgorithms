package com.AlgorithmsJava.Arrays;

import java.util.List;

public class Sorting {
    public  List<Integer> rotLeft(List<Integer> a, int d) {
        for(int i = 0; i < d; i++) {
            int num = a.remove(0);
            a.add(num);
        }
        return a;
    }

}
