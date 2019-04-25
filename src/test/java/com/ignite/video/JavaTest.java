package com.ignite.video;

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

    @Test
    public void test04(){
        //冒泡排序
        int[] arr = {12,15,18,10,11,9,14,16};
        int times =0 ;
        for(int i=0,l= arr.length;i<l;i++){
            for (int j=0;j<l-1;j++){
                //内循环前后交换
                if(arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                }
                times++;
            }
        }
        System.out.println("冒泡排序：排序次数,"+times+"--->");
        for(int a:arr){
            System.out.print(a+",");
        }

    }

    @Test
    public void test05(){
        //选择排序
        int[] arr = {12,15,18,10,11,9,14,16};
        int times =0 ;
        for(int i=0,l=arr.length;i<l;i++){
            //内外循环交换
            for(int j=i+1;j<l;j++){
                if(arr[i] < arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
                times++;
            }
        }

        System.out.println("选择排序：排序次数,"+times+"--->");
        for(int a:arr){
            System.out.print(a+",");
        }
    }

    @Test
    public void test07(){
        //快速排序
        int[] arr = {12,15,18,10,11,9,14,16};
        int times =0 ;
        int low=0,height=arr.length-1;
        quickSort(arr,low,height);
        System.out.println("快速排序：排序次数,"+times+"--->");
        for(int a:arr){
            System.out.print(a+",");
        }
    }

    public int getIndex(int[] arr,int low,int hight){
        int temp=arr[low];
        while(low < hight){
            while (low < hight && arr[hight] >= temp) hight--;
            arr[low] = arr[hight];
            while(low < hight && arr[low] <= temp) low++;
            arr[hight] = arr[low];
        }
        arr[low] = temp;
        return low;
    }

    public void quickSort(int[] arr, int low, int hight){
        if(low < hight){
            int index = getIndex(arr,low,hight);
            quickSort(arr,low,index-1);
            quickSort(arr,index+1,hight);
        }
    }

    @Test
    public void test08(){
        //插入排序
        int[] arr = {12,15,18,10,11,9,14,16};
        int times =0 ;
        for(int i=1,l=arr.length;i<l;i++){
            int temp = arr[i];
            int tempPoint = i-1;
            while(tempPoint>=0 && arr[tempPoint] > temp){
                arr[tempPoint+1] = arr[tempPoint];
                tempPoint--;
            }
            arr[tempPoint+1] = temp;
            System.out.print("排序第"+i+"次");
            for(int a:arr){
                System.out.print(a+",");
            }
            System.out.println();
        }
        System.out.println("插入排序：排序次数,"+times+"--->");
        for(int a:arr){
            System.out.print(a+",");
        }
    }


}
