package org.java.learnString;

public class StringBuilderAndBufferDemo {

    public static void main(String[] args) {

        String str = "Dheeraj";

        String str1 = str + "Is my name";

        System.out.println(str1);
        System.out.println("===Check==>>"+ str1.equals(str));







        StringBuffer sb=new StringBuffer();

        sb.append("hello");

        StringBuilder sb1=new StringBuilder();

        sb1.append("hello");







    }
}
