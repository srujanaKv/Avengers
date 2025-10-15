package com.java.count;

public class Count {
    public static void main(String[] args) {
        String sentence = "I am a photo enthusiast";
        String[] words = sentence.split(" ");
        System.out.println("Num of words: " + words.length);
}
}