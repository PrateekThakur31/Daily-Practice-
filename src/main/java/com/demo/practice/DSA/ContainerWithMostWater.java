package com.demo.practice.DSA;

import java.util.Scanner;

public class ContainerWithMostWater {
    public static int maxArea(int[] height) {

        int left = 0;
        int right = height.length - 1;

        int maxWater = 0;

        while (left < right) {

            int width = right - left;

            int minHeight = Math.min(height[left], height[right]);

            int currentWater = width * minHeight;

            maxWater = Math.max(maxWater, currentWater);

            // Move the smaller height
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxWater;
    }

    public static void main(String[] args) {
       int[] height = {1, 8, 6, 2, 2, 6, 8, 1};

        System.out.println(maxArea(height));
    }
}
