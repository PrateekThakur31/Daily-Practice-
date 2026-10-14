package com.demo.practice.DSA;


public class FloorInSortedArray {

    public static int findFloor(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int ans = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                ans = mid;       // Possible floor
                left = mid + 1;  // Search for a larger value
            } else {
                right = mid - 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 10, 12};
        int target = 5;

        int index = findFloor(arr, target);

        if (index != -1) {
            System.out.println("Floor: " + arr[index]);
            System.out.println("Index: " + index);
        } else {
            System.out.println("Floor does not exist");
        }
    }
}
