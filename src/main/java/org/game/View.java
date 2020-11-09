package org.game;

import java.util.List;

public class View {
    public static final String TRY_INPUT_MESSAGE = "Guess an integer in the range ";
    public static final String INVALID_INPUT_TYPE_MESSAGE = "Wrong type! Please, enter an integer";
    public static final String INVALID_INPUT_VALUE_MESSAGE = "Wrong! Try again.";
    public static final String VALID_INPUT_MESSAGE = "Congratulations, you guessed it! Your attempts:";

    public void showMessage(String message) {
        System.out.println(message);
    }

    public void showFinalMessage(String message, List<Integer> inputNumbers) {
        System.out.println(message);
        for (int number : inputNumbers)
            System.out.print(number + "   ");
    }
}
