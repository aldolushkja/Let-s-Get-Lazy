package com.acme;

import java.util.stream.Stream;

public class InfiniteStreams {

    //Reactive Programming == Functional Programming++
    //Stream of data with lazy evaluation
    //Functional Composition + Lazy Evaluation

    //Polymorphism is to OOP as lazy evaluation is to functional programming
    //Functional composition reduces complexity
    //Lazy evaluation provides efficiency

    //Stream
    //Structure of concurrent code is the same as the structure of sequential code

    //Spark
    //Structure of distributed code is the same as the structure of local code


    public static void main(String[] args) {
        Stream
                .iterate(1, e -> e +1)
                .filter(e -> isEven(e))
                .map(e -> doubleIt(e))
//                .takeWhile( e -> e < 100)
                .limit(10)
                .forEach(System.out::println);

    }

    private static boolean isEven(Integer e) {
        System.out.println("isEven called for " + e);
        return e % 2 == 0;
    }

    private static int doubleIt(Integer n) {
        System.out.println("called for " + n);
        return n * 2;
    }
}
