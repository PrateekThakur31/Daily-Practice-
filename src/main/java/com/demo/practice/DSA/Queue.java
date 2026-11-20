package com.demo.practice.DSA;

class CircularQueue {
    int size;
    int front, rear;
    int[] queue;

    CircularQueue(int size) {
        this.size = size;
        queue = new int[size];
        front = -1;
        rear = -1;
    }

    // Insert element
    void enqueue(int value) {

        if ((rear + 1) % size == front) {
            System.out.println("Queue is Full");
            return;
        }

        if (front == -1) {
            front = 0;
        }

        rear = (rear + 1) % size;
        queue[rear] = value;

        System.out.println(value + " inserted");
    }

    // Delete element
    void dequeue() {

        if (front == -1) {
            System.out.println("Queue is Empty");
            return;
        }

        System.out.println("Deleted: " + queue[front]);

        if (front == rear) {
            front = rear = -1;
        } else {
            front = (front + 1) % size;
        }
    }

    // Display queue
    void display() {

        if (front == -1) {
            System.out.println("Queue is Empty");
            return;
        }

        System.out.print("Queue: ");

        int i = front;

        while (true) {
            System.out.print(queue[i] + " ");

            if (i == rear)
                break;

            i = (i + 1) % size;
        }

        System.out.println();
    }
}

public class Queue {
    public static void main(String[] args) {

        CircularQueue q = new CircularQueue(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);

        q.display();

        q.dequeue();
        q.dequeue();

        q.enqueue(50);
        q.enqueue(60);

        q.dequeue();
        q.display();
    }
}

