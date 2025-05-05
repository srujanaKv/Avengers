package com.java;

interface StringReverser {
    String reverse(String input);
}

class StringReverse {
    public void show() {
        StringReverser reverser = new StringReverser() {
            @Override
            public String reverse(String input) {
                return new StringBuilder(input).reverse().toString();
            }
        };
        String original = "OpenAI";
        String reversed = reverser.reverse(original);
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
    }
}
