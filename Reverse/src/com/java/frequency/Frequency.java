package com.java.frequency;

public class Frequency {
    public static void main(String[] args) {
        String sentence = "If the sun goes down,doesn't matter where we are";
        String[] words = sentence.split(" ");


        for (int i = 0; i < words.length; i++) {
            int count = 1;


            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                    words[j] = "";
                }
            }


            if (!words[i].equals("")) {
                System.out.println(words[i] + ": " + count);
            }
 }
}
}