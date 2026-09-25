package com.demo.practice.DSA;

import java.util.Arrays;

public class ProductofArrayEceptSelf {

    public int[] productExceptSelf(int[] nums) {
        //int[] result = new int[nums.length];


    int n = nums.length;
    int[] result = new int[n];

    // Step 1: Store product of all elements to the left
    result[0]=1;

        for(int i = 1; i<n;i++)

    {
        result[i] = result[i - 1] * nums[i - 1];
    }

    // Step 2: Multiply by product of all elements to the right
    int rightProduct = 1;

        for(int i = n - 1; i >=0;i--)

    {
        result[i] = result[i] * rightProduct;
        rightProduct = rightProduct * nums[i];
    }

        return result;
}

    public static void main(String[] args) {
        ProductofArrayEceptSelf obj = new ProductofArrayEceptSelf();
        int[] ints = obj.productExceptSelf(new int[]{1, 2, 3, 4});
        System.out.println(Arrays.toString(ints));

    }
}
