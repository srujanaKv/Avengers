package com.java;

public class IntFilterRunner {
    public static void main(String[] args) {
        int[] numbers = {10, 15, 20, 25, 30, 35};

        IntFilter filter = new IntFilter();

        filter.filterAndPrint(numbers, new IntCondition() {
            @Override
            public boolean test(int num) {
                return num % 10 == 0;
            }
        });

        filter.filterAndPrint(numbers, (num) -> num > 25);
    }
}