package com.acme;

import java.util.List;

public class LazyInCollection {

    public static List<Person> createPeople() {
        return List.of(
                new Person("Sara", 20),
                new Person("Sara", 22),
                new Person("Bob", 20),
                new Person("Paula", 32),
                new Person("Paul", 32),
                new Person("Jack", 3),
                new Person("Jack", 72),
                new Person("Jill", 11)
        );
    }

    public static void main(String[] args) {
        System.out.println(createPeople()
                .stream()
                .filter(person -> person.getAge() > 30)
                .map(Person::getName)
                .map(String::toUpperCase)
                .findFirst()
                .orElse(""));

        System.out.println("DONE");


        //List                      vs.             Streams
        //collections of data                       collection of functions
        //Bucket of data                            pipeline of functions
    }


}
