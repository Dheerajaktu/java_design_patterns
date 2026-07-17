package org.java.stringBasedCodingQuestions;

public class RevStringDemo {
    public static void main(String[] args) {
        String str = "dheeraj";
        System.out.println(revString(str));
    }

    public static String revString(String str) {
        char[] chars = str.toCharArray();
        int len = chars.length;
        int p1 = 0;
        int p2 = len - 1;

        while(p1 < p2) {
            char temp = chars[p1];
            chars[p1] = chars[p2];
            chars[p2] = temp;
            p1++;
            p2--;
        }
        return new String(chars);
    }
}


