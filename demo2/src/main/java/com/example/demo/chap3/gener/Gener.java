package com.example.demo.chap3.gener;

import java.util.*;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.LinkedBlockingQueue;

public class Gener {

    public static <T> void ship(T t) {
        System.out.println("Preparing" + t);
    }

    public static <T> T ship7(T t) {
        System.out.println("Preparing" + t);
        return t;
    }

    public static void printList(List<?> list) {
        for (Object o : list) System.out.println(o);
    }

    public static int printSub(List<? extends Number> list) {
        int sum = 0;
        for (Number number : list) {
            sum += number.intValue();
            System.out.println(number);
        }
        return sum;
    }

    public static void printSub1(List<? extends Animals> list) {

    }

    public static void printOb(List<? super Object> list) {
        list.add("s");
    }

    public static void main(String[] args) {
//        ArrayList<? extends Number> list3 = new ArrayList<Integer>();
//        List<String> list = new ArrayList<>();
//        list.add("java");
//        printList(list);
        List<Dog> dog=new ArrayList<>();
        printSub1(dog);

        List<Integer> listInter = new ArrayList<>();
        listInter.add(12);
        printList(listInter);
        printSub(listInter);

        List<Long> longs = new ArrayList<>(10);
        longs.add(1l);
        printList(longs);
        printSub(longs);



    }
}
