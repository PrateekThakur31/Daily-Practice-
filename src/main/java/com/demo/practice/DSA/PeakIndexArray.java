package com.demo.practice.DSA;

public class PeakIndexArray {

    public static int peakIndexInMountainArray(int[] arr) {

        int st = 0;
        int end = arr.length - 1;

        while (st < end) {

            int mid = st + (end - st) / 2;

            if (arr[mid] < arr[mid + 1]) {
                st = mid + 1;
            } else {
                end = mid;
            }
        }

        return st;
    }

    public static void main(String[] args) {

        int[] arr = {0, 2, 5, 6, 7, 3, 1};

        int result = peakIndexInMountainArray(arr);

        System.out.println("Peak index: " + result);
    }
}
