package com.sparta.sc;


import java.util.Arrays;

public class App {
    public static void main(String[] args) {

        int[] sortedNumbers = ArraySorter.bubbleSort(new int[]{7, 6, 2, 4, 10, 9, 1, 5, 8, 3});
        System.out.println(Arrays.toString(sortedNumbers));

        int[] mergedArray = ArraySorter.mergeTwoSortedArrays(new int[]{1, 2, 3, 4, 5, 6, 7}, new int[]{4, 5, 6, 7, 8, 9, 10});
        System.out.println(Arrays.toString(mergedArray));
    }
}
