package com.bridgelabz;

public class MyNode<T> implements INode<T> {
    public T data;
    public INode next;

    public MyNode(T data) {
        this.data = data;
        this.next = null;
    }

    @Override
    public T getdata() {
        return data;
    }

    @Override
    public INode getNext() {
        return this.next;
    }

    @Override
    public void setNext(INode next) {
        this.next = next;
    }

    @Override
    public void setdata(T data) {
        this.data = data;
    }
}
