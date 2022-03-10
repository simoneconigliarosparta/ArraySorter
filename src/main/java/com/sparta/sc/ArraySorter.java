package com.sparta.sc;

public class ArraySorter {

    public static int[] bubbleSort(int[] numbers) {

        int tempNumber;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {

                if (numbers[i] > numbers[j]) {
                    tempNumber = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = tempNumber;
                }
            }
        }
        return numbers;
    }


    public static int[] mergeTwoSortedArrays(int[] arrayOne, int[] arrayTwo){

        int[] mergedArray = new int[(arrayOne.length + arrayTwo.length)];

        int i = 0;
        int j = 0;
        int z = 0;

        while (i < arrayOne.length && j < arrayTwo.length){

            if(arrayOne[i] < arrayTwo[j]){
                mergedArray[z] = arrayOne[i];
                i++;
            } else {
                mergedArray[z] = arrayTwo[j];
                j++;
            }
            z++;
        }

        while(i < arrayOne.length){
            mergedArray[z] = arrayOne[i];
            i++;
            z++;
        }

        while (j < arrayTwo.length){
            mergedArray[z] = arrayTwo[j];
            j++;
            z++;
        }

        return mergedArray;
    }
}
