package com.demo.practice.DSA;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Stack<Object> s = new Stack<>();

        // Push different data types
        s.push(10);
        s.push(25.5f);
        s.push("Hello");

        // Display stack elements
        System.out.println("Stack elements:");

        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}


