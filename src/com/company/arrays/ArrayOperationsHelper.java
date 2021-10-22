package com.company.arrays;

import java.util.Arrays;

public class ArrayOperationsHelper {

    /**
     * find min element in array
     *
     * */
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
     *
     * */
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
     *
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
     *
     * */
    public static int[] sequenceWithMaxSum(int[] input) {
        int bestSum = 0;
        int bestStartIndex = 0;
        int bestEndIndex = 0;

        int currentSum = 0;
        int currentStartIndex = 0;
        int currentEndIndex = 0;

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
     *
     * */
    public static int[] sequenceWithMinSum(int[] input) {
        int minSum = Integer.MAX_VALUE;
        int minSumStartIndex = 0;
        int minSumEndIndex = 0;

        int currentSum = 0;
        int currentStartIndex = 0;
        int currentEndIndex = 0;

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
}