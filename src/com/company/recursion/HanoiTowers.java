package com.company.recursion;

public class HanoiTowers {

    public static void swapDiscs(int discsCount, String from, String to, String buffer) {
        if (discsCount != 0) {
            swapDiscs(discsCount - 1, from, buffer, to);
            System.out.println(from + " -> " + to);
            swapDiscs(discsCount - 1, buffer, to, from);
        }
    }
}
