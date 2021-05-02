package com.bridgelabz;

public class Stack {
    LinkedList linkedlist = new LinkedList();

    public <T> void push(MyNode<T> newNode) {
        linkedlist.add(newNode);
    }

    public double printStack() {
        linkedlist.printMyNode();
        return 0;
    }

    public INode peak() {
        return linkedlist.head;
    }

    public void popStack() {
        int count = 3;
        while (count != 0) {
            if (linkedlist.head != linkedlist.tail) {
                linkedlist.pop();
                count--;
                linkedlist.head = linkedlist.head.getNext();
            } else {
                linkedlist.head.setdata(linkedlist.head.getNext());
                count--;
            }
        }
    }


}

