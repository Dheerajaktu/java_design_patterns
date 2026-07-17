package org.java.objectOriented;




interface I1 {
    default void show(){
        System.out.println("I1 Show()");
    }
}

interface I2 {
    default void show(){
        System.out.println("I2 Show()");
    }
}

class C3 implements  I1,I2{
//    public void show() {
//        System.out.println("C3 show()");
//    }

    /*
    * Case - if we need I1's method specifically
    * */

    @Override
    public void show() {
        I1.super.show(); // I2.super.show() can be used too as per need
    }

}

public class InterfaceAmbiguityDemo {


    public static void main(String[] args) {
        C3 c = new C3();
        c.show();
    }
}

