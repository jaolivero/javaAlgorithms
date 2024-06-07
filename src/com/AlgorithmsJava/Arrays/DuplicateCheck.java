package com.AlgorithmsJava.Arrays;

import java.util.HashSet;

public class DuplicateCheck {


    public boolean bruteforceSolution(int [] nums) {

        for(int i = 0; i < nums.length; i++) {
            for(int j = i+1; j < nums.length; j++) {
                if(nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }


    public boolean elegantSolution (int [] nums) {

        HashSet hashy = new HashSet();

        for(int i =0; i < nums.length; i++) {
;
            if(hashy.contains(nums[i])){
                return true;
            }


        }

        System.out.println(hashy);






        return false ;
    }

}
