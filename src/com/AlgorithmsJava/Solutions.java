package com.AlgorithmsJava;

import java.io.IOException;
import java.util.*;

public class Solutions {
    public List<Integer> ranking(List<Integer> ranked, List<Integer> player) {
        List<Integer> playersRank = new ArrayList<>();
        ArrayList<Integer> noDuplicates = new ArrayList<Integer>();

        for (int number : ranked) {
            if (!noDuplicates.contains(number)) {
                noDuplicates.add(number);
            }
        }

        for (int rank = noDuplicates.size() - 1; rank >= 0; rank--) {
            for (int score : player) {
                if (score <= noDuplicates.get(rank)) {
                    playersRank.add(rank);
                    rank--;
                } else {
                    continue;
                }
            }
        }
        return playersRank;
    }

    public long totalCandy(int classSize, List<Integer> rating) {


        int[] candies = new int[rating.size()];

        candies[0] = 1;

        // ArrayList  [3,1,2,2] Rating
        for (int index = 1; index <= rating.size() - 1; index++) {

            if (rating.get(index) > rating.get(index - 1)) {

                candies[index] = candies[index - 1] + 1;

                //candies Array = [1,1,1,1]

                System.out.println(Arrays.toString(candies));

            }
            else
                {
                    candies[index] = 1;
            }
        }
        System.out.println( Arrays.toString(candies));

        long total = candies[0];

        for (int i = rating.size() - 1; i > 0; i--) {

            total += candies[i];

            if (rating.get(i) < rating.get(i - 1))

            {

                candies[i - 1] = Math.max(candies[i - 1], candies[i] + 1);

                // ArrayList  [3,1,2,2] Rating

                //candies Array = [1,1,1,1]

                //index[2] is less than index[1]

            }

        }

        System.out.println( Arrays.toString(candies));

        return total;

    }

//    public int hurdleRace(int jump, List<Integer> height) {
//        int max = jump;
//        int minDoses;
//
//        for(int i = 0; i < height.size(); i++) {
//            if (max < height.get(i) ) {
//                max = height.get(i);
//            }
//        }
//        minDoses = max - jump;
//        return minDoses;


    //recursion
        public int superDigit(String number, int multiple) {
        long total = 0;
        long sum = 0;
        char[] newArray = number.toCharArray();

        if(newArray.length > 1) {
            for(char num : newArray) {
                total += Integer.parseInt(String.valueOf(num));
            }
                sum = total * multiple;
        return superDigit(String.valueOf(sum), 1);
        } else {
            return Integer.parseInt(number);
        }
    }

    public int minimumDistance(List<Integer> numbers) {
        long min = numbers.size();

        for (int current = 0; current < numbers.size(); current++) {
            int ex = numbers.get(current);
            for (int next = current + 1; next < numbers.size(); next++) {
                int idx = numbers.get(next);
                if (ex == idx) {
                    System.out.println(numbers.get(current));
                    long difference = next - current;
                    System.out.println((current + " " + next));

                    min = Math.min(difference, min);
                }
            }
        }

        if(min == numbers.size()) {
            return -1;
        }
            return (int)min;
    }

    public List<Integer> cutTheSticks(List<Integer> arr) {
        List<Integer> copySticks=new ArrayList<>(arr);
        List<Integer> results=new ArrayList<>();
        // Starting Recursion
        int minNumber=0;
        int arrLen=arr.size();
        int copySticksLen=copySticks.size();

        int counter=0;
        minNumber=Collections.min(copySticks);
        for(int idx=0; idx<copySticks.size(); idx++) {
            if(copySticks.get(idx)!=0){
                int cutToLength=copySticks.get(idx)-minNumber;
                copySticks.set(idx, cutToLength);
                counter++;
                results.add(counter);
            }
            System.out.println("c: "+counter);
            System.out.println("copyStick: "+copySticks.toString());
            //  }while(copySticks.size()!=0);
        }
        return results;
    }

    int[] merge (int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        for(int i = 0; i < a.length; i++){
            result[2*i] = a[i];
            result[(2*i) +1] = b[i];
        }
        return result;
    }

    public List<Integer>arrayShift(List <Integer>a,  int rotateNum) {
        List<Integer> shiftedArr = new ArrayList<>();
        int endNum = a.size() - 1;
        int start = 0;

        while(start < rotateNum) {
            shiftedArr.add(start, a.get(rotateNum));
            start++;
        }

        System.out.println(shiftedArr);
        return shiftedArr;
    }


    // a[i + d] % a.size

    //a [0+4 % 5] remainder of four

    // a[4]

    //array[0] = a[4]


    public static int alerts(List<Integer> expenditure, int d) {
        // [2, 2, 3, 3, 4, 4, 5, 6, 8]
        Collections.sort(expenditure);

        int alerts = 0;
        int midway = d / 2;
        float median = 0;

        if(d % 2 == 1)  {
          median = expenditure.get(midway);
        }
        else {
           median = expenditure.get(midway) + expenditure.get(midway) / 2;
        }
        System.out.println(midway + " halfway point");
        System.out.println(median + " median");

        for(int i = d; i < expenditure.size(); i++) {
            int current = expenditure.get(i);
            if(median * 2 >= current ) {
                alerts += 1;
                System.out.println(expenditure.get(i) + "double or equal");
            }
        }

        return alerts;
    }

}