package com.company.arrays;

import java.util.Arrays;
import java.util.stream.Stream;

import static com.company.arrays.ArrayGenerator.generatePackedTestArray;
import static com.company.arrays.ArrayOperationsHelper.uniqueArrayElements;

public class ArraysTasks {

    public static void main(String[] args) {
//        int[] array = new int[]{2, 10, 5, 1, 0, 11};
//
//        System.out.println("Start array: " + Arrays.toString(array));
//        System.out.println("Sequence with max sum: " + Arrays.toString(ArrayOperationsHelper.sequenceWithMaxSum(array)));
//        System.out.println("Sequence with min sum: " + Arrays.toString(ArrayOperationsHelper.sequenceWithMinSum(array)));

//        int[] prices = new int[]{7, 1, 5, 3, 6, 4};
//
//        System.out.println("Prices array: " + Arrays.toString(prices));
//        System.out.println("Max profit: " + ArrayOperationsHelper.maxProfit(prices));

//        int[] numbers = new int[]{1, 2, 3, 4, 5, 6, 7};
//
//        System.out.println("Numbers array: " + Arrays.toString(numbers));
//        System.out.println("Indices : " + Arrays.toString(ArrayOperationsHelper.indicesElementsGraterThenPrevious(numbers)));

//        int[] randomValuesArray = ArrayGenerator.generateTestArray(50, 5, 100);
//        System.out.println("Generated array: " + Arrays.toString(randomValuesArray));
//        System.out.println("Indices: " + Arrays.toString(ArrayOperationsHelper.indicesElementsGraterThenPrevious(randomValuesArray)));

//        ArrayOperationsHelper.reverseArrayPart(numbers, 3);
//
//        System.out.println("Array after reverse last 3 digits: " + Arrays.toString(numbers));

//        System.out.println("Reversed array: " + Arrays.toString(ArrayOperationsHelper.reversArray(array)));

//        System.out.println("After selection sort: " + Arrays.toString(ArraySortHelper.selectionSort(array)));
//        System.out.println("After bubble sort: " + Arrays.toString(ArraySortHelper.bubbleSort(array)));
//        System.out.println("After quick sort: " + Arrays.toString(ArraySortHelper.quickSort(array)));

        Integer[] input1 = generatePackedTestArray(1000, 0, 1000);
        Integer[] input2 = generatePackedTestArray(1500, 0, 1500);

        System.out.println("Array input1: " + Arrays.toString(input1));
        System.out.println("Array input2: " + Arrays.toString(input2));

        Integer[] input1Uniques = uniqueArrayElements(input1, input2);
        System.out.println("Input1 uniques: " + Arrays.toString(input1Uniques));

        Integer[] input2Uniques = uniqueArrayElements(input2, input1);
        System.out.println("Input2 uniques: " + Arrays.toString(input2Uniques));

        Integer[] result = Stream.concat(
                        Arrays.stream(input1Uniques),
                        Arrays.stream(input2Uniques))
                .toArray(Integer[]::new);

        System.out.println("Result array: " + Arrays.toString(result));
    }
}
