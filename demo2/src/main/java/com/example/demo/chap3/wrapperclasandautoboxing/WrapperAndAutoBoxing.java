package com.example.demo.chap3.wrapperclasandautoboxing;

import java.util.ArrayList;
import java.util.List;

public class WrapperAndAutoBoxing {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(new Integer(3));
        numbers.add(new Integer(5));
        numbers.add(new Integer(5));
        numbers.remove(1);
        numbers.remove(new Integer(5));
        System.out.println(numbers);
        //1

        int a=1;
        Integer b=a;
        System.out.println(b);
    }
}
