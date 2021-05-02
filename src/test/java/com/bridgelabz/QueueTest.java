package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class QueueTest<T> {
    @Test
    public void given3NumbersEnqueue() {
        MyNode<T> myFirstNode  =  new   MyNode(56);
        MyNode<T> mySecondNode =  new   MyNode(30);
        MyNode<T> myThirdNode  =  new   MyNode(70);
        Queue queue = new Queue();
        queue.enqueue(myFirstNode);
        queue.enqueue(mySecondNode);
        queue.enqueue(myThirdNode);
        queue.printQueue();
        INode top = queue.top();
        Assert.assertEquals(myFirstNode, top);
    }

    @Test
    public void dequeueUntillTheQueueIsNull() {
        LinkedList linkedList = new LinkedList();
        MyNode<T> myFirstNode  =  new   MyNode(56);
        MyNode<T> mySecondNode =  new   MyNode(30);
        MyNode<T> myThirdNode  =  new   MyNode(70);
        Queue queue = new Queue();
        queue.enqueue(myFirstNode);
        queue.enqueue(mySecondNode);
        queue.enqueue(myThirdNode);
        queue.dequeue();
        queue.printQueue();
        Object result = queue.top().getdata();
        Assert.assertEquals(null,result);
    }
}