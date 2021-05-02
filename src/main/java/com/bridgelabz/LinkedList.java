package com.bridgelabz;

public class LinkedList implements List<INode> {
    public INode head;
    public INode tail;

    public LinkedList() {
        this.head = null;
        this.tail = null;
    }

    @Override
    public void add(MyNode newNode) {
        if (this.tail == null) {
            this.tail = newNode;
        }
        if (this.head == null) {
            this.head = newNode;
        } else {
            INode tempNode = this.head;
            this.head = newNode;
            this.head.setNext(tempNode);
        }
    }

    @Override
    public void append(INode newNode) {
        if (this.head == null) {
            this.head = newNode;
        }
        if (this.tail == null) {
            this.tail = newNode;
        } else {
            this.tail.setNext(newNode);
            this.tail = newNode;
        }
    }
    @Override
    public void insert(INode mynode ,INode newNode){
        INode tempNode = mynode.getNext();
        mynode.setNext(newNode);
        newNode.setNext(tempNode);
    }

    @Override
    public INode pop() {
            INode tempNode = this.head;
            this.head = head.getNext();
            return tempNode;
    }

    @Override
    public INode popLast(){
        INode tempNode = head;
        while(!tempNode.getNext().equals(tail)){
            tempNode = tempNode.getNext();
        }
        this.tail = tempNode;
        tempNode.setNext(null);
        return tempNode;
    }

    @Override
    public INode popInBetween(int value) {
        INode tempNode = head;
        INode previousNode = head;
        while (tempNode != null && !tempNode.getdata().equals(value)) {
            previousNode = tempNode;
            tempNode = tempNode.getNext();
        }
        if (tempNode == null)
            return null;
        previousNode.setNext(tempNode.getNext());
        return tempNode;
    }
    @Override
    public boolean searchNode(int data) {
        INode tempNode = head;
        data = 30;
        while(tempNode != null){
            if (tempNode.getdata().equals(data)) {
                return true;
            }
            tempNode = tempNode.getNext();
        }
        return false;
    }

    @Override
    public void insertInBetween(INode myNode, INode newNode) {
        INode tempNode = myNode.getNext();
                myNode.setNext(newNode);
                newNode.setNext(tempNode);

    }

    @Override
    public void printMyNode() {
        StringBuffer myNodes = new StringBuffer("My Nodes: ");
        INode tempNode = head;
        while (tempNode.getNext() != null) {
            myNodes.append(tempNode.getdata());
            if (!tempNode.equals(tail)) myNodes.append("->");
            tempNode = tempNode.getNext();
        }
        myNodes.append(tempNode.getdata());
        System.out.println(myNodes);
    }
}