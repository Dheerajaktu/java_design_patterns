package org.java.learnString;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Ignore {
    public static void main(String[] args) {

        ExecutorService es = Executors.newFixedThreadPool(10);
        es.submit(() ->{
            System.out.println("Recommended over creating Async threads manually.");
        });
    }
}
