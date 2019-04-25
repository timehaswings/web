package com.ignite.video;

public class MyLinkedList {

    private LinkedEntity first;

    public void MyLinkedList(){
        this.first = null;
    }

    public void addFirst(int data){
        LinkedEntity entity=new LinkedEntity();
        entity.setData(data);
        entity.setNext(first);
        this.first = entity;
    }

    public int deleteFirst(){
        if(isEmpty()){
            throw new RuntimeException("链表为空");
        }
        LinkedEntity temp = first;
        first = first.getNext();
        return temp.getData();
    }

    public void display(){
        LinkedEntity entity = first;
        while (entity != null){
            System.out.println(entity.getData());
            entity = entity.getNext();
        }
    }

    public LinkedEntity findFirst(int value){
        LinkedEntity entity = first;
        while (entity != null){
            if(entity.getData() == value){
                return entity;
            }
            entity = entity.getNext();
        }
        return null;
    }

    public LinkedEntity delete(int key){
        LinkedEntity link = null;
        LinkedEntity cur = first;
        LinkedEntity next = first.getNext();
        LinkedEntity previous = null;
        while(cur != null){
            if(cur.getData() == key){  //找到了要删除的链结点
                link = cur;
                //如果当前链结点的前驱为null，证明当其为链表的第一个链结点，删除该链结点后需要对first属性重新赋值
                if(previous ==null){
                    this.first =next;
                }else{
                    //删除操作，即将前驱的next指针指向当前链结点的next，链表中将去当前链结点这一环
                    previous.setNext(next) ;
                }
                break;
            }else if(cur.getNext() ==null){  //当前链结点不是目标且下一个链结点为null，证明没有要删除的链结点
                break;
            }
            //当前链结点不是要删除的目标，则向后继续寻找
            next = next.getNext();
            cur = cur.getNext();
            previous = cur;
        }

        return link;
    }

    public boolean isEmpty(){
        return (first == null);
    }

}
