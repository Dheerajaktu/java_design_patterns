package org.java.youTubeMockInterviewQuestions;

public class ImplementSingletonDemo {

    public static void main(String[] args) {
        SingletonDemo obj = SingletonDemo.getSingletonInstance();
        System.out.println("SingletonDemo.getSingletonInstance() = " + obj);
    }

}


class SingletonDemo {

    private static SingletonDemo instance;

    private SingletonDemo() {}

    public static  SingletonDemo getSingletonInstance(){
        if(instance==null){
            instance=new SingletonDemo();
        }
        return instance;
    }

}
