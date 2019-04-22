package com.ignite.video;

import com.ignite.video.async.Task;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

@RunWith(JUnit4.class)
public class JavaTest {

    @Test
    public void test01(){
        int a = 10;
        int b =10;
        A a1= new A("zhangjie","asdf");
        A a2= new A("zhangjie","asdf");
        System.out.println(a == b);
        System.out.println(a1.equals(a1));
        System.out.println(a1.equals(a2));
        System.out.println(a2.equals(a1));
        System.out.println(a2.equals(null));
    }

    @Test
    public void test02() throws ExecutionException, InterruptedException {
        TaskTest taskTest=new TaskTest();
        FutureTask<Integer> task=new FutureTask<Integer>(taskTest);
        new Thread(task).start();
        System.out.println(task.isDone());
        task.cancel(false);
        System.out.println(task.isCancelled());
        System.out.println(task.get());
    }

    @Test
    public void test03(){
        A a=new A("fanbinbin","666666");
        A b=a.clone();
        b.setName("liuyifei");
        System.out.println(b);
        System.out.println(a);


    }
}
