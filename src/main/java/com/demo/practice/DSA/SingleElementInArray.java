package com.demo.practice.DSA;

public class SingleElementInArray {

    public static int SingleElementInSortedArray(int[] arr) {
        int left=0;
        int right=arr.length-1;

        while(left<right){
            int mid= left + (right - left)/2;

            if(mid%2==1){
                mid--;
            }
            if(arr[mid]==arr[mid+1]){
                left=mid+2;
            }else {
                right=mid;
            }
        }
        //return arr[left];
        return left;
    }

    public static void main(String[] args) {
        int arr[]={8,1,1,2,2,3,3,4,5,5,6,6,7,7};
        int result=SingleElementInSortedArray(arr);
        System.out.println("SingleElement : " + result);
    }
}
