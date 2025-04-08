package com.sruj.external;

import com.sruj.internal.Shell;

public class Decoration {
    public void decorate() {
        Shell shell = new Shell();
        shell.collect();
        System.out.println("Decorating with shells");
    }
}


