package org.game;

import static org.junit.Assert.*;

import org.junit.Test;

public class MethodNameTests {

    @Test
    public void checkThatMethodIsExist() {

        String methodName = "checkValue";
        try {
            var method = Model.class.getMethod(methodName).getName();
        } catch (NoSuchMethodException e) {
            fail(methodName + " method is not found");
            e.printStackTrace();
        }
    }
}
