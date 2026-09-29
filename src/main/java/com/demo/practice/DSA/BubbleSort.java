package com.demo.practice.DSA;

public class BubbleSort {
    public static void main(String[] args) {
          int arr[]={5,1,2,4,3};
        //int arr[]={1,2,3,4,5};

        int n = arr.length;

         for(int i=0;i<n;i++){
             boolean isSwap=false;
             for (int j=0;j<n-i-1;j++){
                 if(arr[j]>arr[j+1]){
                     int temp=arr[j];
                     arr[j]=arr[j+1];
                     arr[j+1]=temp;
                     isSwap=true;

                 }
             }
             if(!isSwap){
                 break;
             }
         }
         for(int num:arr){
             System.out.print(num+" ");
         }

        System.out.println(Math.ceil(4.3));
    }

    void insertSort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int curr= arr[i];
            int prev= arr[i-1];
            while(prev>=0 && arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=curr;
        }
    }
}
