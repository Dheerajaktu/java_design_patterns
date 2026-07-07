package org.java.objectOriented;

public class MethodOverRiding {

    public static void main(String[] args) {
        B b = new B();
        b.show();
    }
}


class A{
    void show(){
        System.out.println("show A");
    }
}

class B extends A{
    void show(){
        System.out.println("show B");
    }
}