package com.ignite.video;


import com.ignite.video.async.Task;
import org.jboss.logging.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.Future;

@RunWith(SpringRunner.class)
@SpringBootTest
public class VideoApplicationTests {

    private Logger logger = Logger.getLogger(getClass());

    @Test
    public void contextLoads() {
        logger.info("输出info");
        logger.debug("输出debug");
        logger.error("输出error");
    }

    @Autowired
    private Task task;

    @Test
    public void test() throws Exception {

        long start = System.currentTimeMillis();

        Future<String> task1 = task.doTaskOne();
        Future<String> task2 = task.doTaskTwo();
        Future<String> task3 = task.doTaskThree();

        while(true) {
            if(task1.isDone() && task2.isDone() && task3.isDone()) {
                // 三个任务都调用完成，退出循环等待
                break;
            }
            Thread.sleep(1000);
        }

        long end = System.currentTimeMillis();

        System.out.println("任务全部完成，总耗时：" + (end - start) + "毫秒");

    }

    @Test
    public void test002(){
        String str="Hello";
        StringBuilder builder =new StringBuilder(str);
        builder.reverse();
        System.out.println(builder.toString());
    }

}
