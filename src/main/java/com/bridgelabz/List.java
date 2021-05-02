package com.bridgelabz;

public interface List<INode> {
    void add(MyNode newNode);
    void append(INode newNode);
    void printMyNode();
    void insert(INode newNode, INode myNode);
    INode pop();
    INode popLast();
    boolean searchNode(int i);
    void insertInBetween(INode myNode, INode newNode);
    INode popInBetween(int i);
}
