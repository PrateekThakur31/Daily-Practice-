package com.demo.practice.JavaStream;


import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CreateStreams {
    public static void main(String[] args) {
//        List<String> names= Arrays.asList("Alice", "Bob");
//        //list -> To Stream
//        Stream<String> stream = names.stream();
//        System.out.println(names);
//        //Array-> Stream
//        String[] arr={"Alice","Mike","Stallin","John"};
//        Stream<String> stream1 = Arrays.stream(arr);
//        System.out.println(arr);
//        System.out.println(stream1);
//        stream1.forEach(System.out::println);
//
//        //Integer->Stream using Stream.of
//        Stream<Integer> intStream = Stream.of(1, 2, 3, 4, 5);
//        System.out.println(intStream);
//        intStream.forEach(System.out::println);
//
//        //Stream Generate
//        Stream<Double> limit = Stream.generate(Math::random).limit(2);
//        limit.forEach(System.out::println);

        String[] fruits = new String[] { "apple", "berry", "citrus" };
        Map<String, String> m = Stream
                .of(fruits)
                .collect(Collectors.toMap(
                        s -> s.toUpperCase().substring(0,1),
                        Function.identity()));
        m.forEach((k, v) -> System.out.println(k + "->" + v));

    }
}
