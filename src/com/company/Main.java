package com.company;

import jep.Jep;
import jep.JepException;

public class Main {

    public static void main(String[] args) throws JepException {
        JepCall();
    }

    public static void JepCall() throws JepException {

        // Evaluate Java through JEP
        try (Jep jep = new Jep()) {
            jep.eval("from java.lang import System");
            jep.eval("s = 'Hello World'");
            jep.eval("System.out.println(s)");
        }

        // Execute Python through JEP
        try (Jep jep = new Jep()) {
            jep.runScript("src/testscript.py");
        }
    }
}
