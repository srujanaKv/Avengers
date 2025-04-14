package com.java.internal.parrot.external99;

import com.java.internal.parrot.internal99.Parrot;
import com.java.internal.parrot.internal99.TalkingParrot;

public class ParrotRunner {

    public void performSpeak(Parrot parrot) {
        if (parrot != null) {
            parrot.Speak();
            if (parrot instanceof TalkingParrot) {
                TalkingParrot talkingParrot = (TalkingParrot) parrot;
                talkingParrot.Mimic();
            }
        } else {
            System.out.println("No parrot to speak.");
        }
    }
}
