package com.solvingProblems;

public class algo {
    // 10 2 3
    // 3 1
    // 5 2 8
    // returns 9
    static int getMoneySpent(int[] usb, int[] keyboards, int budget) {
        int maxSpend = -1;
        for (int keyPrice : keyboards) {
            for (int usbPrice : usb) {
                if (keyPrice + usbPrice <= budget) {
                    if (maxSpend <= keyPrice + usbPrice) {
                        maxSpend = keyPrice + usbPrice;
                    }
                }
            }
        }
        return maxSpend;
    }
}