package org.java.java17NewFeatures;

import java.util.Objects;


/*
* Note - Incase of Records Java generates followings :
* 1 - Constructor
* 2 - Getters
* 3 - toString()
* 4 - equals
* 5 - hashCode()
* */


// With Records (Bas one line Kam khatam, rest everything will generate at run time, Java will handle it's own)
public record RecordsDemo(int id, String name) {
}

//Without Records
class Student {
    private int id;
    private String name;

    public Student(int id, String name) {
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
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + "]";
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        return true;
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}