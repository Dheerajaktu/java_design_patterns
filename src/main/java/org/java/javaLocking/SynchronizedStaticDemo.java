package org.java.javaLocking;

public class SynchronizedStaticDemo {

    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();

        Thread t1 = new Thread(() ->{
            c1.print();
        }, " Thread-1");

        Thread t2 = new Thread(() ->{
            c2.print();
        }, " Thread-2");

        t1.start();
        t2.start();
    }
}

class Counter {

    public static synchronized void print(){

        System.out.println("Printing Start"+ Thread.currentThread().getName());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Printing Completed"+ Thread.currentThread().getName());

    }
}