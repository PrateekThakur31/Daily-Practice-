package com.demo.practice.JavaStream;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterEvenNumber {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(1, 2, 3, 4, 5,  7,6, 8, 9,10);

        List<Integer> result=num.stream()
                .filter(e -> e % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(result);


//        Square of given integer
        List<Integer> result1 =num.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());
        System.out.println(result1);

        // Square of even number
        List<Integer> result2=num.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .collect(Collectors.toList());
        System.out.println(result2);

         // number greaterthan5
        List<Integer> result3=num.stream()
                .filter(n -> n > 5 )
                .collect(Collectors.toList());
        System.out.println(result3);

        // number first number greaterthan 5
        Optional<Integer> first=num.stream()
                .filter(n -> n > 5 )
                .sorted()
                .findFirst();
        System.out.println(first.get());

        //count greater than 5
        long result4=num.stream()
                .filter(n -> n > 5 )
                .count();
        System.out.println(result4);

        //sum of integers
        Integer sum=num.stream()
                .reduce(0,(a,b)->a+b);
        System.out.println(sum);

        //sum of integers square
        Integer sum1=num.stream()
                .map(n ->n*n)
                .reduce(0,(a,b)->a+b);
        System.out.println(sum1);

        //sum of integers even num square
        Integer sum2=num.stream()
                .filter(n-> n%2==0)
                .map(n ->n*n)
                .reduce(0,(a,b)->a+b);
        System.out.println(sum2);

        // max number
        Optional<Integer> max=num.stream()
                //.map(n -> n * n)
                .max(Integer::compare);
        System.out.println(max.get());

        // min number
        Optional<Integer> min=num.stream()
                .map(n -> n * n)
                .min(Integer::compare);
        System.out.println(min.get());
    }
}
