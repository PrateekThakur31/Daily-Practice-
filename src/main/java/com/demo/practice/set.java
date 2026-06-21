package com.demo.practice;

import java.util.*;

public class set {
    public static void main(String[] args) {
        Set<String> arr = new HashSet<>();
        arr.add("India");
        arr.add("cannada");
        arr.add("Japan");
        arr.add("Italy");
        arr.add("Germany");
        arr.add("India");


        System.out.println(arr);
        System.out.println(arr.size());
    }
}

