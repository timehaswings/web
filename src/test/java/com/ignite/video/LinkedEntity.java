package com.ignite.video;

public class LinkedEntity {

    private int data;

    private LinkedEntity next;

    public LinkedEntity(){}

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public LinkedEntity getNext() {
        return next;
    }

    public void setNext(LinkedEntity next) {
        this.next = next;
    }
}
