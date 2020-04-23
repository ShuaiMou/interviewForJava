package com.saul.interviewForJava.基础.集合;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

/**
 * @Auther: Saul
 * @Date: 23/4/20 18:51
 * @Description:
 */
public class TestQueue {
    @Test
    public void testPriorityQueue(){
        PriorityQueue<Integer> queue = new PriorityQueue(10, Collections.reverseOrder());
        queue.addAll(Arrays.asList(22,44,77,33,2,5,9,88,4,33));

        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }

    @Test
    public void testPriorityQueue2(){
        PriorityQueue<Integer> queue = new PriorityQueue();
        queue.addAll(Arrays.asList(22,44,77,33,2,5,9,88,4,33));

        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }

    @Test
    public void testPriorityQueue3(){
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>(10, (o1, o2)->{return o1 - o2;});
        queue.addAll(Arrays.asList(22,44,77,33,2,5,9,88,4,33));

        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }


}
