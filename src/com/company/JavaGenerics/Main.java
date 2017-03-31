package com.company.JavaGenerics;

import java.util.ArrayList;
import java.util.concurrent.SynchronousQueue;

/**
 * Created by srnegi on 2/25/2017.
 */
public class Main {

    public static void main(String[] args){
        ArrayList<Integer> items = new ArrayList<>();
        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
//        items.add("tom");
        items.add(5);
        items.add(6);
        printDoubled(items);

    }
    private static void printDoubled(ArrayList<Integer> n){
        for(int i: n){
            System.out.println(i * 2);
        }
    }
}
