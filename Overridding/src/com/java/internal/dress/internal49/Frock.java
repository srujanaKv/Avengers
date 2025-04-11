package com.java.internal.dress.internal49;

    public class Frock extends Dress {
        @Override
        public void Wear() {
            System.out.println("running wear");
        }

        public void Design() {
            System.out.println("running design in frock");
            super.Wear();
        }
    }

