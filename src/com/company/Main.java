package com.company;

import jep.Jep;
import jep.JepConfig;
import jep.JepException;
import jep.NDArray;

public class Main {

    public static void main(String[] args) throws JepException {
        JepCall();
    }

    public static void JepCall() throws JepException {

        /**
         *  Execute Python syntax through JEP
         */
        try (Jep jep = new Jep()) {
            jep.eval("from java.lang import System");
            jep.eval("s = 'Hello World'");
            jep.eval("System.out.println(s)");
        }

        /**
         *  Execute Python files through JEP
         */
        try (Jep jep = new Jep()) {
            jep.runScript("src/testscript.py");
        }

        /**
         *  Allocate N-Dimensional arrays inside Java with Python's NumPy module
         *
         *  var `x` is a numpy.ndarray with shape (3,3) and dtype float32.
         *  1.0  2.1  3.3
         *  4.5  5.6  6.7
         *  7.8  8.9  9.0
         */
        try {

            JepConfig jepConfig = new JepConfig();
            Jep jep = jepConfig.createJep();

            float[] f = new float[]{
                    1.0f, 2.1f, 3.3f,
                    4.5f, 5.6f, 6.7f,
                    7.8f, 8.9f, 9.0f
            };

            NDArray<float[]> nd = new NDArray<>(f, 3, 3);

            jep.set("x", nd);
            jep.close();

        } catch (JepException e) {
            System.err.println("JepException " + e);
            // e.printStackTrace();
        }



    }
}
