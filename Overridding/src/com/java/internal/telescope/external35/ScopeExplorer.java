package com.java.internal.telescope.external35;

import com.java.internal.telescope.internal35.Telescope;
import com.java.internal.telescope.internal35.SpaceScope;

public class ScopeExplorer {

    public void action(Telescope telescope) {
        if (telescope != null) {
            telescope.Zoom();
            if (telescope instanceof SpaceScope) {
                SpaceScope scope = (SpaceScope) telescope;
                scope.ViewGalaxy();
            }
        } else {
            System.out.println("No telescope to explore with.");
        }
    }}
