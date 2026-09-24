package com.demo.practice.JavaStream;

import java.util.*;
import java.util.stream.Collectors;

public class FindDuplicate {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10,2,5,8,7);
        // remove the duplicates using set
        Set<Integer> set = num.stream()
                .collect(Collectors.toSet());
        set = new HashSet<>(num);
        System.out.println(set);
        // remove the duplicates using distinct
        List<Integer> list=num.stream()
                .distinct()
                .toList();
        System.out.println(list);
        //reverse using in decreasing order
        List<Integer> num1 = Arrays.asList(2,4,6,7,9,3,7,4,1,10,5,3);
        List<Integer> list1 = num1.stream()
                .sorted(Comparator.reverseOrder())
                .toList();
        System.out.println(list1);
        // string starts with A
        List<String> fruits = Arrays.asList("Apple","Pear","Banana","Fig","Strawberry","Avacado", "Apricot");
        long a = fruits.stream()
                .filter(f -> f.startsWith("A"))
                .count();
        System.out.println(a);
        //combine the string with ,
        String collect = fruits.stream()
                .collect(Collectors.joining(","));
        System.out.println(collect);

        //greater than 0
        List<Integer> num2 = Arrays.asList(2,4,7,7,4,1,10,5);
        boolean b = num2.stream()
                .allMatch(n -> n > 0);
        System.out.println(b);
        //divisible by 3
        boolean c = num2.stream()
                .anyMatch(n -> n % 3==0);
        System.out.println(c);

        //first highest number
        Optional<Integer> first1 = num2.stream()
                .sorted(Comparator.reverseOrder())
                .skip(0)
                .findFirst();
        System.out.println(first1.get());

        //Secand highest number
        Optional<Integer> first = num2.stream()
                .sorted(Comparator.reverseOrder())
                .skip(2)
                .findFirst();
        System.out.println(first.get());



    }
}
