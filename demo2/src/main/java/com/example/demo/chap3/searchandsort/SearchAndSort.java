package com.example.demo.chap3.searchandsort;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SearchAndSort {
    public static void main(String[] args) {
//        int []numbers={5,2,1,8};
//        Arrays.sort(numbers);
//        System.out.println(Arrays.toString(numbers));
//        System.out.println(Arrays.binarySearch(numbers,4));
        //[1, 2, 5, 8]
        //-3

        List<Integer> list=Arrays.asList(9,7,4,2);
        Collections.sort(list);
        System.out.println(Collections.binarySearch(list,4));
        System.out.println(Collections.binarySearch(list,5));
        // 1 , -3


    }
}
