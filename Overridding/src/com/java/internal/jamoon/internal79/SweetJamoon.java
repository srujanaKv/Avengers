package com.java.internal.jamoon.internal79;

    public class SweetJamoon extends Jamoon {
        @Override
        public void Taste() {
            System.out.println("running taste");
        }

        public void Serve() {
            System.out.println("running serve in sweet jamoon");
            super.Taste();
        }
    }

