package com.demo.practice.DSA;

public class Palindrome {
    public static void main(String[] args) {
        String str="Madam";

        String s = str.toLowerCase();
        int left=0;
        int right=str.length()-1;

         boolean isPalindrome=true;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                isPalindrome=false;
                break;
            }
            right--;
            left++;

        }if(isPalindrome){
            System.out.println("isPalindrome:"+s);
        }else {
            System.out.println("isNotPalindrome:" +s);
        }

    }
}
