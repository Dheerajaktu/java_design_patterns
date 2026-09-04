package org.java.stringBasedCodingQuestions;

public class CountWordsInString {


    public static void main(String[] args) {
        String str = "My  name is Sheela    Sheeela  Ki     Zawani I am    so";

        int result = 0;
        boolean inWord = false;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch != ' ') {

                if (!inWord) {
                    result++;
                    inWord = true;
                }

            } else {
                inWord = false;
            }
        }

        System.out.println("Number of words in string: " + result);
    }
}
