package com.demo.practice.DSA;

public class NextGreaterElement {
    public static void main(String[] args) {

        int arr[] = {4, 5, 2, 10, 8};
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int next = -1;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[i]) {
                    next = arr[j];
                    break;
                }
            }

            System.out.print(next + " ");
        }
    }
}
