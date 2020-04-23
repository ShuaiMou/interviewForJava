package com.saul.interviewForJava.基础.集合;

import org.junit.Test;

import java.util.*;

/**
 * @Auther: Saul
 * @Date: 23/4/20 19:48
 * @Description:
 */
public class TestList {

    @Test
    public void testList(){
        List<Integer> list = new LinkedList();
        list.addAll(Arrays.asList(1,2,3,4,5,6));
        System.out.println("1 " + list );
        List<Integer> sub = list.subList(1,3);
        System.out.println("2 " + sub);
        sub.add(10);
        System.out.println("2.1 " + sub);
        System.out.println("3 " + list.containsAll(sub));
        Collections.shuffle(list);
        System.out.println("4 " + list );
        list.sort(Comparator.comparingInt((Integer o) -> o));
        System.out.println("5 " + list );
        Integer[] objects = list.toArray(new Integer[0]);
        System.out.println("5.1" + objects.length);
        list.clear();

        System.out.println("6 " + list.isEmpty());

    }

    @Test
    public void testListIterator(){
        List<Integer> list = new LinkedList<>();
        list.addAll(Arrays.asList(11,22,33,44,55,66,77,88,99));
        ListIterator<Integer> listIterator = list.listIterator();
        while (listIterator.hasNext()){
            System.out.println(listIterator.next() + "," + listIterator.previousIndex() +
                    "," + listIterator.nextIndex());
        }

        System.out.println("\n");

        while (listIterator.hasPrevious()){
             System.out.println(listIterator.previous() + "," + listIterator.previousIndex() +
                "," + listIterator.nextIndex());
              }   
    }
}
