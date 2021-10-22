package com.company.arrays;

public class ArraySortHelper {

    public static int[] bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
        return array;
    }

    public static int[] selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;

            for (int j = i; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }

        return array;
    }

    public static int[] quickSort(int[] array) {
        if (array.length == 1) {
            return array;
        }
        return quickSort(array, 0, array.length - 1);
    }

    private static int[] quickSort(int[] array, int leftBorder, int rightBorder) {
        int leftMarker = leftBorder;
        int rightMarker = rightBorder;

        int pivotIndex = (rightMarker + leftMarker) / 2;

        int pivotElement = array[pivotIndex];

        do {
            while (array[leftMarker] < pivotElement) {
                leftMarker++;
            }

            while (array[rightMarker] > pivotElement) {
                rightMarker--;
            }

            if (leftMarker <= rightMarker) {

                if (leftMarker < rightMarker) {
                    int tmp = array[leftMarker];
                    array[leftMarker] = array[rightMarker];
                    array[rightMarker] = tmp;
                }

                leftMarker++;
                rightMarker--;
            }

        } while (leftMarker <= rightMarker);

        if (leftMarker < rightBorder) {
            quickSort(array, leftMarker, rightBorder);
        }

        if (leftBorder < rightMarker) {
            quickSort(array, leftBorder, rightMarker);
        }

        return array;
    }
}
