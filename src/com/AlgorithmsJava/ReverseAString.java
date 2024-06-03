package com.AlgorithmsJava;

public class ReverseAString {
        // Strings are immutable, new instances are created when manipulating

        //String Builder is mutable and has .reverse(), .toString()

        //Manually Loop through String then place in another String

            //Insert into String Builder
    public String reverseWithBuilderMethod(String str) {
        return new StringBuilder(str).reverse().toString();

    }

//a lot of instances will be garbage collected it not for StringBuilder method
    private static  String StringReverseManully(String str) {

        StringBuilder sb = new StringBuilder();

        for(int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

}
