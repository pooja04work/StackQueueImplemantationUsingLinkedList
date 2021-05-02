package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class StackTest<T> {
    @Test
    public void given3NumbersWhenAddedToStackShouldHaveLastAddedNode() {
        MyNode<T> myFirstNode = new MyNode(70);
        MyNode<T> mySecondNode = new MyNode(30);
        MyNode<T> myThirdNode = new MyNode(56);
        Stack stack = new Stack();
        stack.push(myFirstNode);
        stack.push(mySecondNode);
        stack.push(myThirdNode);
        stack.printStack();
        INode peak = stack.peak();
        Assert.assertEquals(myThirdNode, peak);
    }
}
