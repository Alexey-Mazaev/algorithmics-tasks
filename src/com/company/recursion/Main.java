package com.company.recursion;

public class Main {
    public static void main(String[] args) {
        System.out.println("Recursion fun");
        System.out.println("Factorial of 5: " + FactorialCalculator.calculate(5));

        System.out.println("Hanoi towers");
        HanoiTowers.swapDiscs(5, "A", "B", "Buffer");
    }
}
