package com.demo.practice.DSA;

import java.util.HashMap;

public class FindTarget {
    public static void main(String[] args) {
        int arr[]={2,7,4,6};
        int target=9;
//        for (int i=0;i<arr.length;i++){
////            if (arr[i]==target){
////                System.out.println(i+"->"+ arr[i]);
////            }
//            for (int j=i+1;j<arr.length;j++){
//                if (arr[i]+arr[j]==target){
//                    System.out.println(arr[i]+ "+" + arr[j] + "=" + target);
//                }
//            }
//
//        }

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            int complement = target - arr[i];

            if (map.containsKey(complement)) {

                System.out.println(
                        "Numbers are: " +
                                complement + " and " + arr[i] + ":"  + " target = "+
                                target
                );

                break;
            }

            map.put(arr[i], i);
        }
    }
}
