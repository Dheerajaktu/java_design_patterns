package org.java.dsaLearning.stringBased;

public class LogestCommonPrefixDemo {
    public static void main(String[] args) {
        String [] str1 = {"flower", "flower", "flight", "fly"};
        String result = getLogestCommonString(str1);
        System.out.println("Result==>"+ result);

    }

    public static String getLogestCommonString(String[] strArr) {
        int len = strArr.length;
        if(len == 0) return "";
        if(len == 1) return strArr[0];
        String result = "";
        String first = strArr[0];

        for(int i = 0; i < first.length(); i++){
            char curr = first.charAt(i); // finding the first char here

            for(int j =1; j < len; j++){

                if(i >= strArr[j].length()  || strArr[j].charAt(i) != curr){
                    return result;
                }

            }
            result += curr;
        }
        return result;
    }
}
