package com.demo.practice.DSA;


public class SquareRoot {
    public static int floorSqrt(int n) {

        int left = 1;
        int right = n;
        int ans = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Use division to avoid mid * mid overflow
            if (mid <= n / mid) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int n = 25;
        System.out.println(floorSqrt(n));
    }
}

