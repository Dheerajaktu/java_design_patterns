package org.java.objectOriented;

public class InstanceVariableHiding {

    public static void main(String[] args) {
        P1 obj = new P2();
        System.out.println(obj.x);
    }
}


class P1 {
    int x = 10;
}

class P2 extends P1{
    int x = 20;
}

//Variables are resolved using the reference type, not the object type. --> answer would be 10;