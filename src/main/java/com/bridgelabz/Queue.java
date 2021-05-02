package com.bridgelabz;

public class Queue {
    LinkedList linkedlist = new LinkedList();

    public <T> void enqueue(MyNode<T> newNode) {
        linkedlist.append(newNode);
    }
    public double printQueue() {
        linkedlist.printMyNode();
        return 0;
    }

    public INode top() {
        return linkedlist.head;
    }
}
