package com.company.palindrome;

public class PalindromeStringHelper {
    /**
     * Need to check that a input string is a palindrome
     *
     * @param input - input string that need to be checked
     *
     * Examples of palindrome: aabaa, cabbac, a   ba
     */
    public static boolean isPalindrome(String input) {
        int startIndex = 0;
        int endIndex = input.length() - 1;

        boolean result = true;

        while (startIndex < input.length() / 2 && endIndex > input.length() / 2 && result) {

            while (!Character.isLetterOrDigit(input.charAt(startIndex))) {
                startIndex++;
            }

            while (!Character.isLetterOrDigit(input.charAt(endIndex))) {
                endIndex--;
            }

            result = input.charAt(startIndex) == input.charAt(endIndex);

            startIndex++;
            endIndex--;
        }

        return result;
    }
}
