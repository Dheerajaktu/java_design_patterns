package org.java.internalWorking;

import java.util.HashMap;

public class HashMapDemo {


    public static void main(String[] args) {
        HashMap<UserData, String> map = new HashMap<>();

        UserData u1 = new UserData(101, "Dheeraj", 30);
        UserData u2 = new UserData(102, "Princy", 28);
        UserData u3 = new UserData(101, "Dheeraj", 30);

        System.out.println("------------- PUT u1 -------------");
        map.put(u1, "One");

        System.out.println("\n------------- PUT u2 -------------");
        map.put(u2, "Two");

        System.out.println("\n------------- PUT u3 -------------");
        map.put(u3, "Three");

        System.out.println("\n------------- GET u1 -------------");
        System.out.println(map.get(u1));

        System.out.println("\n------------- GET NEW OBJECT -------------");
        System.out.println(map.get(new UserData(101, "Dheeraj", 30)));

        System.out.println("\n------------- FINAL MAP -------------");
        System.out.println(map);

    }
}
class UserData{
    private int id;
    private String name;
    private int age;

    public UserData(int id, String name, int age){
        this.name=name;
        this.id = id;
        this.age = age;
    }

    @Override
    public String toString() {
        return "UserData{" + "id=" + id + ", name='" + name + '\'' + ", age=" + age + '}';
    }

    @Override
    public int hashCode() {
        System.out.println("hashCode() called for " + id);
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("equals() called for " + id);

        if(this == obj) return true;

        if(!(obj instanceof UserData)) return false;

        UserData other = (UserData) obj;
        return this.id == other.id;

    }
}