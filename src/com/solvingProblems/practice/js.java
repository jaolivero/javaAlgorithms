package com.solvingProblems.practice;

public class js {
    public void NewYearsChaosP() {
        int [] line = {5,2, 1,3,4}
        int swap = 0;
        int bribes;
        int pos = 0;

        for(int i = line.length - 1; i >= 0; i--) {
            bribes = line[pos] - (pos++);
            System.out.println(bribes);
            System.out.println(line.length);
        }
    }
}
