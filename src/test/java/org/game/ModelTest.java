package org.game;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class ModelTest {
    private final int value;
    boolean result;
    private Model model;

    public ModelTest(int value) {
        this.value = value;
    }

    @Before
    public void initialize() {
        model = new Model();
        model.setHiddenValue();
    }

    @Parameterized.Parameters
    public static List<Integer> input() {
        return Arrays.asList(0, 50, 100, 73);
    }

    @Test
    public void verifyCheckValueMethod() {
        System.out.println(value);
        System.out.println(model.getHiddenValue());
        result = (value == model.getHiddenValue());
        assertEquals("checkValue method returns wrong result", result, model.checkValue(value));
        assertEquals("The list of Input Numbers is not saved", (int) model.getInputNumbers().get(0), value);
    }

}