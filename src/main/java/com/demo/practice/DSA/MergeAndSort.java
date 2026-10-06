package com.demo.practice.DSA;

public class MergeAndSort {

    public static void main(String[] args) {

        int[] arr1 = {5, 2, 8, 1};
        int[] arr2 = {9, 3, 7, 4};

        int[] result = new int[arr1.length + arr2.length];

        // Copy arr1
        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i];
        }

        // Copy arr2
        for (int i = 0; i < arr2.length; i++) {
            result[arr1.length + i] = arr2[i];
        }

        // Sort using for loops
        for (int i = 0; i < result.length - 1; i++) {

            for (int j = 0; j < result.length - i - 1; j++) {

                if (result[j] > result[j + 1]) {

                    int temp = result[j];
                    result[j] = result[j + 1];
                    result[j + 1] = temp;
                }
            }
        }

        // Print result
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}