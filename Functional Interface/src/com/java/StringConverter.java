package com.java;

interface StringConverter {
    String convert(String str);
}

class StringFormat {
    public void applyFormat(String[] arr, StringConverter converter) {
        for (String s : arr) {
            System.out.println(converter.convert(s));
        }
    }
}