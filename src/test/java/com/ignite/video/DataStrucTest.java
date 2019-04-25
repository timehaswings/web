package com.ignite.video;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class DataStrucTest {

    @Test
    public void test001(){
        MyLinkedList linkedList=new MyLinkedList();
        linkedList.addFirst(10);
        linkedList.addFirst(9);
        linkedList.addFirst(13);
        linkedList.addFirst(8);
        linkedList.addFirst(14);
//        System.out.println("del------>"+linkedList.deleteFirst());
//        System.out.println("find------>"+linkedList.findFirst(13).getData());
        System.out.println("delete key------>"+linkedList.delete(13).getData());
        linkedList.display();
    }

}
