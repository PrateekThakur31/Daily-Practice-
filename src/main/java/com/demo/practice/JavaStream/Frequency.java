package com.demo.practice.JavaStream;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Frequency {
    public static void main(String[] args) {
        String str="Programming";

        Map<Character , Long> frequency= str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(ch -> ch,Collectors.counting()));
        System.out.println(frequency);

        int[] arr = {1, 2, 2, 3, 3, 3, 4, 4, 5};

        Map<Integer, Long> frequency1 = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(
                        num -> num,
                        Collectors.counting()
                ));

        System.out.println(frequency1);
    }
}
