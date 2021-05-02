package com.bridgelabz;

public class Stack {
    LinkedList linkedlist = new LinkedList();

    public <T> void push(MyNode<T> newNode) {
        linkedlist.add(newNode);
    }

    public void printStack() {
        linkedlist.printMyNode();
    }

    public INode peak() {
        return linkedlist.head;
    }

}