package com.company.arrays;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[]{2, 10, 5, 1, 0, 11};

        System.out.println("Start array: " + Arrays.toString(array));
        System.out.println("Sequence with max sum: " + Arrays.toString(ArrayOperationsHelper.sequenceWithMaxSum(array)));
        System.out.println("Sequence with min sum: " + Arrays.toString(ArrayOperationsHelper.sequenceWithMinSum(array)));


//        System.out.println("Reversed array: " + Arrays.toString(ArrayOperationsHelper.reversArray(array)));

//        System.out.println("After selection sort: " + Arrays.toString(ArraySortHelper.selectionSort(array)));
//        System.out.println("After bubble sort: " + Arrays.toString(ArraySortHelper.bubbleSort(array)));
//        System.out.println("After quick sort: " + Arrays.toString(ArraySortHelper.quickSort(array)));
    }
}
