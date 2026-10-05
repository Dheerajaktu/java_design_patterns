package org.java.threading;

public class BasicThreading {
    public static void main(String[] args) {

        MyThred t1 = new MyThred();
        t1.start();

        MyThredOne t2 = new MyThredOne();
        // t2.start();

    }

}

class MyThred extends Thread {

    @Override
    public void run() {
        System.out.println("Task running using Thread Class...");
    }
}

class MyThredOne implements Runnable {
    @Override
    public void run() {
        System.out.println("Task Running using Runnable Interface...");
    }
}