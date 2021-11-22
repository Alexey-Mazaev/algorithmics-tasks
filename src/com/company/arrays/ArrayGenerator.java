package com.company.arrays;

import java.util.Random;

public class ArrayGenerator {

    /**
     * generate array with random values
     * @param length - array
     * @param minRandomValue - left border for random values in array
     * @param maxRandomValue - right border for random values in array
     * */
    public static int[] generateTestArray(int length, int minRandomValue, int maxRandomValue) {
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = minRandomValue + (int) (Math.random() * maxRandomValue);
        }
        return array;
    }

    /**
     * generate array with random values
     * @param length - array
     * @param minRandomValue - left border for random values in array
     * @param maxRandomValue - right border for random values in array
     * */
    public static Integer[] generatePackedTestArray(int length, int minRandomValue, int maxRandomValue) {
        Integer[] array = new Integer[length];
        for (int i = 0; i < length; i++) {
            array[i] = minRandomValue + (int) (Math.random() * maxRandomValue);
        }
        return array;
    }
}
