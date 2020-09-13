package com.solvingProblems;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int newArray[] = {10, 5, 20, 20, 4, 5, 2, 25, 1};
        System.out.println(Arrays.toString(BreakingRecords(newArray)));
    }

    public static int[] BreakingRecords(int[] scores){
        int best = 0;
        int worst = 0;
        int lowScore = scores[0];
        int highScore = lowScore;

        for(int i = 0; i < scores.length; i++) {
            if(scores[i] > highScore) {
                highScore = scores[i];
                best++;
            } else if (scores[i] < lowScore) {
                lowScore = scores[i];
                worst++;
            }
        }

        return new int[] {best, worst};
    }
}
