package com.AlgorithmsJava;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Collections;
import java.util.List;

public class TwoStrings {

    public static String Substring(String a, String b) {
        char[] arr = b.toCharArray();
        String answer= "";

        for (char letter : arr) {
            if (a.indexOf(letter) > -1) {
                System.out.println("Yes");
                return "Yes";
            }
            else {
            }
        }
        System.out.println("No");
                return "No";
    }

    public static int maximumToys(List<Integer> prices, int k) {
        int max = 0;
        Collections.sort(prices);

        for(int i = 0; i < prices.size(); i++) {
            int current = prices.get(i);
            if(k >= current) {
                k -= current;
                max++;
            }
        }
        System.out.println(max);
        return max;
    }

    public void twoArrayStrings(List<String> a, List<String> b)  {
        //copy from here
        String s1,s2;
        int count;

        for(int i=0;i<a.size();i++)
        {
            s1=a.get(i);
            s2=b.get(i);
            count=0;
            for(int j=0;j<s1.length(); j++)
            {
                System.out.println(s1 + s2);
                for(int k=0;k<s2.length(); k++)
                {
                    System.out.println(s1.charAt(j)+" s1 " + " s2 " + s2.charAt(k));
                    if(s1.charAt(j) == s2.charAt(k))
                    {
                        count++;
                        break;
                    }
                }
                if(count==1)
                    break;
            }
            if(count==1)
                System.out.println("YES");
            else
                System.out.println("NO");
        }//copy till here where your code ends
    }
}
