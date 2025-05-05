package com.java;

public class SubstringFilterRunner {
    public static void main(String[] args) {
        String[] words = {"notebook", "pen", "pencil", "bookcase", "bookmark", "paper"};

        String keyword = "book";

        SubstringFilter filter = new SubstringFilter();

        filter.filterAndPrint(words, new SubstringChecker() {
            @Override
            public boolean contains(String str) {
                return str.contains(keyword);
            }
        });
    }
}