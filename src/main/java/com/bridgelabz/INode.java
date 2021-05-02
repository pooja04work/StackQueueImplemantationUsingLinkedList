package com.bridgelabz;

public interface INode<T> {
    T getdata();
    void setdata(T data);

    INode getNext();
    void setNext(INode next);
}
