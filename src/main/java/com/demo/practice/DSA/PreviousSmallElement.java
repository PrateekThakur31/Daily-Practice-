package com.demo.practice.DSA;

public class PreviousSmallElement {
    public static void main(String[] args) {

        int arr[] = {4, 5, 2, 10, 8};
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int previous = -1;

            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] < arr[i]) {
                    previous = arr[j];
                    break;
                }
            }

            System.out.print(previous + " ");
        }
    }
}
