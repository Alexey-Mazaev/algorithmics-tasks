package com.company.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayOperationsHelper {

    /**
     * find min element in array
     */
    public static int findMin(int[] array) {
        int result = array[0];
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] < result) {
                result = array[i];
            }
        }
        return result;
    }

    /**
     * find max element in array
     */
    public static int findMax(int[] array) {
        int result = array[0];
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] > result) {
                result = array[i];
            }
        }
        return result;
    }

    /**
     * reverse elements in array
     */
    public static int[] reversArray(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }

        return array;
    }

    /**
     * find sequence with max sum of element in array
     */
    public static int[] sequenceWithMaxSum(int[] input) {
        int bestSum = 0;
        int bestStartIndex = 0;
        int bestEndIndex = 0;

        int currentSum = 0;
        int currentStartIndex = 0;
        int currentEndIndex;

        for (int i = 0; i < input.length; i++) {
            currentEndIndex = i;

            if (currentSum <= 0) {
                currentStartIndex = currentEndIndex;
                currentSum = input[i];
            } else {
                currentSum += input[i];
            }

            if (currentSum > bestSum) {
                bestSum = currentSum;
                bestStartIndex = currentStartIndex;
                bestEndIndex = currentEndIndex + 1;
            }

        }

        return Arrays.copyOfRange(input, bestStartIndex, bestEndIndex);
    }

    /**
     * find sequence with min sum of elements in array
     */
    public static int[] sequenceWithMinSum(int[] input) {
        int minSum = Integer.MAX_VALUE;
        int minSumStartIndex = 0;
        int minSumEndIndex = 0;

        int currentSum = 0;
        int currentStartIndex = 0;
        int currentEndIndex;

        for (int i = 0; i < input.length; i++) {
            currentEndIndex = i;

            if (currentSum > minSum) {
                currentStartIndex = currentEndIndex;
                currentSum = input[i];
            } else {
                currentSum += input[i];
            }

            if (currentSum <= minSum) {
                minSum = currentSum;
                minSumStartIndex = currentStartIndex;
                minSumEndIndex = currentEndIndex + 1;
            }
        }
        return Arrays.copyOfRange(input, minSumStartIndex, minSumEndIndex);
    }


    /**
     * You are given an integer array prices where prices[i] is the price of a given stock on the ith day.
     * <p>
     * On each day, you may decide to buy and/or sell the stock. You can only hold at most one share of the stock at any time.
     * However, you can buy it then immediately sell it on the same day.
     * <p>
     * Find and return the maximum profit you can achieve.
     */
    public static int maxProfit(int[] prices) {
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                maxProfit += prices[i] - prices[i - 1];
            }
        }

        return maxProfit;
    }

    public static void reverseArrayPart(int[] input, int k) {
        for (int i = 0; i < k; i++) {
            int last = input[input.length - 1];

            for (int j = input.length - 2; j >= 0; j--) {
                input[j + 1] = input[j];
            }

            input[0] = last;
        }
    }

    /**
     * need to find indices of elements that grater than previous element of array
     * */
    public static Integer[] indicesElementsGraterThenPrevious(int[] input) {
        if (input.length <= 1) {
            return new Integer[0];
        }

        List<Integer> output = new ArrayList<>();
        for (int i = 1; i < input.length; i++){
            if (input[i - 1] < input[i]) {
                output.add(i);
            }
        }

        Integer[] result = new Integer[output.size()];
        output.toArray(result);

        return result;
    }
}