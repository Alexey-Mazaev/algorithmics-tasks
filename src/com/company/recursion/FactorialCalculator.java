package com.company.recursion;

public class FactorialCalculator {

    public static int calculate(int x) {
        if (x == 1) return 1;
        return x * calculate(x - 1);
    }
}