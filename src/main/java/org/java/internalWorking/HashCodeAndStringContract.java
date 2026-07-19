package org.java.internalWorking;

public class HashCodeAndStringContract {
    public static void main(String[] args) {
        Student s1 = new Student(101, "dheeraj");
        Student s2 = new Student(101, "dheeraj");
        Student s3 = s1;

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        System.out.println(s1 == s2);

        System.out.println(s1.equals(s2));

        System.out.println(s1 == s3);

        System.out.println(s1.hashCode() == s3.hashCode());
    }
}


class Student{
    private int id;
    private String name;

    public  Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
}