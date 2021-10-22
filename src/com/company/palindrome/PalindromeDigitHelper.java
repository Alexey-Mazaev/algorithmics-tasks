package com.company.palindrome;

public class PalindromeDigitHelper {
    /**
     * Need to revere
     *
     * @param input - input digit
     * @return - reversed digit
     *
     * Example: 1234 after complete return 4321
     */
    public static int reverseDigit(int input) {
        int result = 0;

        while (input > 0) {
            result = result * 10 + input % 10;
            input = input / 10;
        }

        return result;
    }

    /**
     * Need to check that a input digit is a palindrome
     *
     * @param input - input digit that need to be checked
     *
     * Examples of palindrome: 11211, 12321
     */
    public static boolean isPalindrome(int input) {
        return input == reverseDigit(input);
    }
}
