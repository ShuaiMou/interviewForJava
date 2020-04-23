package com.saul.interviewForJava.基础.集合;

import org.junit.Test;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * @Auther: Saul
 * @Date: 23/4/20 22:51
 * @Description:
 */
public class TestStack {

    @Test
    public void testStack(){
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(11);
        stack.push(22);
        stack.push(33);
        stack.push(44);
        System.out.println(stack.pop());
        System.out.println(stack);
        Iterator<Integer> iterator = stack.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next() + "  ");
        }
    }

    @Test
    public void testStack2(){
        Deque<Integer> stack = new LinkedList<>();
        stack.push(11);
        stack.push(22);
        stack.push(33);
        stack.push(44);
        System.out.println(stack.pop());
        System.out.println(stack);
        Iterator<Integer> iterator = stack.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next() + "  ");
        }
    }
}
