package org.java.objectOriented;

public class StaticMethodHiding {

    public static void main(String[] args) {

        A1 obj = new A2();
        obj.show();
    }
}


class A1 {
    static void show() {
        System.out.println("A1");
    }
}

class A2 extends A1 {
    static void show() {
        System.out.println("A2");
    }
}