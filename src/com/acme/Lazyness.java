package com.acme;

import java.util.function.Supplier;

public class Lazyness {

    public static int expensive(int n) {
        System.out.println("Called...");
        return n * 2;
    }

    public static void main(String[] args) {
        // write your code here

        final int x = 14;

//        final int temp = expensive(x);
//
//        if (x > 5 && temp > 7)
//            System.out.println("Path 1");
//        else
//            System.out.println("Path 2");

//         Lazy evaluation
        final Supplier<Integer> temp = () -> expensive(x);
        System.out.println("Here..");
        if(x > 5 && temp.get() > 7)
            System.out.println("Path 1");
        else
            System.out.println("Path 2");
    }
}
