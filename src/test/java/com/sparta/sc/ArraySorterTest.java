package com.sparta.sc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ArraySorterTest {

    @Test
    @DisplayName("Given an array should return sorted")
    void givenAnArrayShouldReturnSorted() {
        int[] array = {4, 8, 9, 5, 7, 6, 3, 1, 2, 10};
        int[] expectedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Assertions.assertArrayEquals(expectedArray, ArraySorter.bubbleSort(array));
    }

    @Test
    @DisplayName("Given two sorted arrays should return one sorted")
    void givenTwoSortedArraysShouldReturnOneSorted() {
        int[] arrayOne = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] arrayTwo = {4, 5, 6, 7, 8, 9, 10, 11, 12};
        int[] expectedArray = {1, 2, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 10, 11, 12};
        Assertions.assertArrayEquals(expectedArray, ArraySorter.mergeTwoSortedArrays(arrayOne, arrayTwo));
    }

    @Test
    @DisplayName("Given an empty array and one sorted should return the one sorted")
    void givenAnEmptyArrayAndOneSortedShouldReturnTheOneSorted() {
        int[] arrayOne = {};
        int[] arrayTwo = {4, 5, 6, 7, 8, 9, 10, 11, 12};
        int[] expectedArray = {4, 5, 6, 7, 8, 9, 10, 11, 12};
        Assertions.assertArrayEquals(expectedArray, ArraySorter.mergeTwoSortedArrays(arrayOne, arrayTwo));
    }


}
