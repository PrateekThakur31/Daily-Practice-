package com.demo.practice.DSA;

public class TripletSum {
    public static void main(String[] args) {

        int arr[] = {2, 4, 6, 3, 7, 1};
        int target = 12;

        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                for (int k = j + 1; k < arr.length; k++) {

                    if (arr[i] + arr[j] + arr[k] == target) {
                        System.out.println(
                                arr[i] + ", " + arr[j] + ", " + arr[k]
                        );
                    }
                }
            }
        }
    }
}
