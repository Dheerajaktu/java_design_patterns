package org.java.objectOriented;

public class FinalMethodOverRide {
    public static void main(String[] args) {
        FinalDemo2 fd2 = new FinalDemo2();


    }
}


class FinalDemo {
     void show(){
        System.out.println("Class FinalDemo Show()");
    }
}

class FinalDemo2 extends FinalDemo {
    void show(){
        System.out.println("Class FinalDemo2 Show()");
    }
}