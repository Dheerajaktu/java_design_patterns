package org.java;

import org.java.designPatterns.creationalDesignPatterns.SingletonPattern;


public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Java Internal ......!!!");

        SingletonPattern instance1 = SingletonPattern.getInstance();
        System.out.println("singleton object 1: "+instance1);

        SingletonPattern instance2 = SingletonPattern.getInstance();
        System.out.println("singleton object 2: "+instance2);


        SingletonPattern instance3 = SingletonPattern.getInstance();
        System.out.println("singleton object 3: "+instance3);

    }
}