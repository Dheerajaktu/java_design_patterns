package org.java.java21NewFeatures;

public class VirtualThreadsDemo {

    public static void main(String[] args) {
        Thread vt = Thread.startVirtualThread(() ->{
            System.out.println("Virtual Thread : "+ Thread.currentThread());
        });

        vt.start();
    }
}
