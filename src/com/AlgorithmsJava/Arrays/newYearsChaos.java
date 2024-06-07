package com.AlgorithmsJava.Arrays;

import java.util.ArrayList;

public class newYearsChaos {
    String tooChaotic = "Too Chaotic";
    int totalBribes = 0;
    ArrayList<Integer> originalOrder = new ArrayList<>();

    public void waitingInLine(int[] line, int Person) {
        for (int i = 0; i < line.length; i++) {
//            originalOrder[i].add(i+1);
            if (line[i] - (i + 1) > 2) {
                System.out.println(tooChaotic);
            }
            for(int j = 0; j < i; j++) {
                if(line[j] > line[i]) {
                    totalBribes++;
                }
            }
        }
    }
    }
    // i[0] j[0]  compare 2 with 2, nope
    // i[0] j[1] compare 2 with 1, i > j, bribes++
    //i[0] j[2] compare 2 with 5, i > j, false
    //i[0] j[3] compare 2 with 3, i > j, false
    //i[0] j[4] compare 2 with 4, i > j, false