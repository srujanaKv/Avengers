package com.java.internal.tree.external18;

import com.java.internal.tree.internal18.Tree;
import com.java.internal.tree.internal18.MangoTree;

public class Tree {

    public void action(Tree tree) {
        if (tree != null) {
            tree.Grow();
            if (tree instanceof MangoTree) {
                MangoTree mango = (MangoTree) tree;
                mango.Fruit();
            }
        } else {
            System.out.println("No tree to interact with.");
        }
    }
}
