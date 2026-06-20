package org.java.codingQuestions;

public class RevStringTwo {
    public static void main(String[] args) {
        String str = "dheeraj";

        //Using Simple Way -- using StringBuilder class

        StringBuilder builder = new StringBuilder(str);

        System.out.println("======1=="+builder);


        builder.reverse();

        System.out.println("======2=="+builder.toString());

    }
}
