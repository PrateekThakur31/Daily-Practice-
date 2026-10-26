package com.demo.practice.DSA;

public class ArrayIntersection {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 2, 3, 4};
        int arr2[] = {2, 2, 4, 6};

        int i = 0;
        int j = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr1[i] > arr2[j]) {
                j++;
            } else {
                if (i == 0 || arr1[i] != arr1[i - 1]) {
                    System.out.print(arr1[i] + " ");
                }
                i++;
                j++;
            }
        }
    }
}
