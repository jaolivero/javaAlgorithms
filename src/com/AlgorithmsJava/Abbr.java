package com.AlgorithmsJava;

public class Abbr {
    public String abbrCase (String a, String b) {
    char[] newArray = b.toCharArray();
    boolean output = true;
    for(int index = 0, bIndex = 0; index < newArray.length; index++) {
        System.out.println(index);
        // if letter in String A is UPPERCASE and != a match then we cannot remove;
        if(!(a.indexOf(newArray[index]) == -1)) {

            output = false;
            break;
        }
    }
    return output ? "YES": "NO";
}
}

//b[index].equalsIgnoreCase(a)
