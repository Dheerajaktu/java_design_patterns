package org.java.objectOriented;

public class UpcastingDemo {

    public static void main(String[] args) {

        /* RT Polymorphism */
        Animal animal = new Dog();
        animal.sound();

//        Animal animal2 = new Dog();
//        animal2.bark();

    }
}

class Animal{
    void sound(){
        System.out.println("Animal");
    }

}

class Dog extends Animal{
    void sound(){
        System.out.println("Dog");
    }

    void  sound2(){
        System.out.println("Dog Bark");
    }
}