package com.demo.practice.DSA;

public class IntegerPalindrome {
    public static void main(String[] args) {
        int num= 1221;
        int original = num;
        int reverse=0;

        while (num>0){
            int digit = num%10;
            reverse = reverse*10+digit;
            num=num/10;
        }
        System.out.println(reverse);
        if(original==reverse){
            System.out.println(original+" is a palindrome");
        }else {
            System.out.println(original+" is not a palindrome");
        }

    }
}
