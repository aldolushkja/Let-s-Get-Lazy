package com.acme;

public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        System.out.println("getName called for " + name);
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        System.out.println("getAge called for " + name);
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString(){
        return String.format("%s -- %d", name, age);
    }
}
