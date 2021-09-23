package com.AlgorithmsJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //TwoStrings test = new TwoStrings();
        Solutions test = new Solutions();

        List<Integer> days = new ArrayList<Integer>(Arrays.asList(2, 3, 4 ,2, 3, 6, 8, 4, 5));


       int answer =  test.alerts(days, 5);
        System.out.println(answer);
        //test.solutions();

        //test.Substring("cat", "high");
       // solutions.minimumDistance(distance);
       // List<String> second = Arrays.asList("ab", "cd", "ef");
        //List<String> first = Arrays.asList("ab", "df", "ok");

        //test.twoArrayStrings(first, second);
    }
}
