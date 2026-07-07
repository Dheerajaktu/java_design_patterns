package org.java.objectOriented;

public class ParenConstructorCall {

    public static void main(String[] args) {
        new Child();
    }
}

class Parent {
    public Parent() {
        System.out.println("A");
    }
}

class Child extends Parent {
    public Child() {
        System.out.println("C");
    }
}

/*
* Parent constructor called first
* */