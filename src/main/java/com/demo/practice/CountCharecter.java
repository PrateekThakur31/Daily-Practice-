package com.demo.practice;

import java.util.Scanner;

public class CountCharecter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int vowels = 0;
        int consonants = 0;
        int spaces = 0;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            // Convert character to lowercase
            ch = Character.toLowerCase(ch);

            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                    ch == 'o' || ch == 'u') {

                vowels++;

            } else if (ch >= 'a' && ch <= 'z') {

                consonants++;

            } else if (ch == ' ') {

                spaces++;
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Spaces: " + spaces);
    }
}
