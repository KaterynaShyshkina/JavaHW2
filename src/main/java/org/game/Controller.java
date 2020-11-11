package org.game;

import java.util.Scanner;

public class Controller {
    private View view;
    private Model model;

    public Controller(View view, Model model) {
        this.view = view;
        this.model = model;
    }

    public void playGame() {
        Scanner scanner = new Scanner(System.in);
        model.setHiddenValue();
        //System.out.println(model.getHiddenValue());  //for test run
        view.showMessage(View.TRY_INPUT_MESSAGE + "[" + model.getMinValue() + ", " + model.getMaxValue() + "]");
        verifyInput(scanner);
    }

    public void verifyInput(Scanner scanner) {
        boolean win = false;
        while (!win) {
            if (!scanner.hasNextInt()) {
                view.showMessage(View.INVALID_INPUT_TYPE_MESSAGE);
                scanner.next();
                continue;
            }
            if (model.checkValue(scanner.nextInt())) {
                view.showFinalMessage(View.VALID_INPUT_MESSAGE, model.getInputNumbers());
                win = true;
            } else {
                view.showMessage(View.INVALID_INPUT_VALUE_MESSAGE);
                view.showMessage(View.TRY_INPUT_MESSAGE + "[" + model.getMinValue() + ", " + model.getMaxValue() + "]");
            }
        }
    }

}
