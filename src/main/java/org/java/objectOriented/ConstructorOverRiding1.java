package org.java.objectOriented;

class One   {
    public One() {
        System.out.println("One, Parent Constructor Called!");
        show();
    }
    void show(){
        System.out.println("show One");
    }
}

class Two extends One{
    int x = 10;
    void show(){
        System.out.println("show Two==>>"+ x);
    }
}

public class ConstructorOverRiding1 {

    public static void main(String[] args) {
        System.out.println("============CASE 1=====================");
        Two obj = new Two();
        obj.show();
        System.out.println("=============CASE 2====================");
        One obj1 = new Two();
        obj1.show();
        System.out.println("=============CASE 3====================");
        One obj2 = new One();
        obj2.show();
    }
}
