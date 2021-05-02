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

    public void dequeue() {
        int count = 3;
        while (count != 0) {
            if (linkedlist.head != linkedlist.tail) {
                linkedlist.pop();
                count--;
                printQueue();
                linkedlist.head = linkedlist.head.getNext();
                printQueue();
           }
            else {
                linkedlist.head.setdata(linkedlist.head.getNext());
                count--;
            }
        }
    }
}
