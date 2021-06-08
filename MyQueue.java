package com.bridgelabz;

public class MyQueue {
    private final MyLinkedList myLinkedList;
    private final MyStack myStack;

    public MyQueue() {
        this.myLinkedList=new MyLinkedList();
        this.myStack=new MyStack();
    }

    public void enqueue(INode myNode) {
        if(isEmpty()) {
            myLinkedList.add(myNode);
        }else{
            myLinkedList.append(myNode);
        }
    }
}