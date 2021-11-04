package com.company.palindrome;

public class PalindromesTasks {

    public static void main(String[] args) {
        System.out.println("Palindrome checker");

        String inputA = "AAAABBBAAAA";
        String inputB = "aaaaa baaaaa";

        System.out.println("InputA is palindrome? \n Result: " + PalindromeStringHelper.isPalindrome(inputA));
        System.out.println("InputB is palindrome? \n Result: " + PalindromeStringHelper.isPalindrome(inputB));

        int digitA = 123456;
        int digitB = 11211;

        System.out.println("InputA is palindrome? \n Result: " + PalindromeDigitHelper.isPalindrome(digitA));
        System.out.println("InputB is palindrome? \n Result: " + PalindromeDigitHelper.isPalindrome(digitB));
    }
}
