package com.java;

interface NumberChecker {
    void check(int num);
}

class NumberCheck {
    public void show() {
        NumberChecker anonymous = new NumberChecker() {
            @Override
            public void check(int num) {
                if (num % 2 == 0) {
                    System.out.println(num + " is Even");
                } else {
                    System.out.println(num + " is Odd");
                }
            }
        };

        NumberChecker lambda = (num) -> {
            if (num % 2 == 0) {
                System.out.println(num + " is Even");
            } else {
                System.out.println(num + " is Odd");
            }
        };

        anonymous.check(5);
        lambda.check(8);
    }
}
