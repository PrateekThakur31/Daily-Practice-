
package com.demo.practice.DSA;

class HeterogeneousStack {

    Object[] stack;
    int top;
    int size;

    HeterogeneousStack(int size) {
        this.size = size;
        stack = new Object[size];
        top = -1;
    }

    // Push operation
    void push(Object value) {

        if (top == size - 1) {
            System.out.println("Stack Overflow");
            return;
        }

        stack[++top] = value;
        System.out.println(value + " inserted");
    }

    // Pop operation
    void pop() {

        if (top == -1) {
            System.out.println("Stack Underflow");
            return;
        }

        System.out.println("Deleted: " + stack[top]);
        stack[top] = null;
        top--;
    }

    // Display operation
    void display() {

        if (top == -1) {
            System.out.println("Stack is Empty");
            return;
        }

        System.out.println("Stack elements:");

        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }
}

public class heterogeneousStack1 {

    public static void main(String[] args) {

        HeterogeneousStack s = new HeterogeneousStack(5);

        s.push(10);
        s.push(20.5f);
        s.push("Hello");
        s.push('A');
        s.push(100);

        s.display();

        s.pop();

        s.display();
        s.pop();
        s.display();
    }
}
