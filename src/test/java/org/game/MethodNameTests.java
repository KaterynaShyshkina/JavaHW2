package org.game;

import org.junit.Test;

public class MethodNameTests {
    @Test
    public void checkMethodName() {
        try {
            var method = Model.class.getMethod("checkValue").getName();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
