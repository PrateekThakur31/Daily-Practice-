package com.demo.practice;

import java.util.Scanner;

public class MoveHash {

    public static String moveHashToFront(String str) {

        StringBuilder hash = new StringBuilder();
        StringBuilder other = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch == '#') {
                hash.append(ch);
            } else {
                other.append(ch);
            }
        }

        return hash.toString() + other.toString();

        //return  other.toString()+hash.toString();
    }

    public static void main(String[] args) {

       //String str = "Move#all#hashes";

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String result = moveHashToFront(str);

        System.out.println(result);
    }
}