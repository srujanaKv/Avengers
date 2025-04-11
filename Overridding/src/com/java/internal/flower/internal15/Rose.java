package com.java.internal.flower.internal15;

    public class Rose extends Flower {
        @Override
        public void Bloom() {
            System.out.println("running bloom");
        }

        public void Smell() {
            System.out.println("running smell in rose");
            super.Bloom();
        }
    }
