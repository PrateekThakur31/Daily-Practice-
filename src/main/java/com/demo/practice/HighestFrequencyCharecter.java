package com.demo.practice;

import java.util.HashMap;
import java.util.Scanner;

public class HighestFrequencyCharecter {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        String str = Sc.nextLine();

        HashMap<Character,Integer> h= new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (h.containsKey(c)) {
                int oldFre=h.get(c);
                int newFre=oldFre+1;
                h.put(c,newFre);
            }else  {
                h.put(c,1);
            }
        }
        char maxFreChar= str.charAt(0);
        char minFreChar= str.charAt(0);
        int maxFre=h.get(maxFreChar);
        int minFre=h.get(minFreChar);
        for(Character key:h.keySet()) {
            if (h.get(key)>maxFre) {
                maxFre=h.get(key);
                maxFreChar=key;
            }
            if (h.get(key)<minFre) {
                minFre=h.get(key);
                minFreChar=key;
            }
        }
        System.out.println("Highest Frequency Character : "+maxFreChar);
        System.out.println("Frequency: " + maxFre);

        System.out.println("Lowest Frequency Character : "+minFreChar);
        System.out.println("Frequency: " + minFre);

        Sc.close();
    }
}
