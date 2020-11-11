package org.game;

import org.apache.commons.math3.random.RandomDataGenerator;

import java.util.ArrayList;
import java.util.List;

public class Model {
    private int minValue = 0;
    private int maxValue = 100;
    private int hiddenValue;
    private List<Integer> inputNumbers = new ArrayList<>();

    public int getMinValue() {
        return minValue;
    }

    public int getMaxValue() {
        return maxValue;
    }

    public int getHiddenValue() {
        return hiddenValue;
    }  //for unit test

    public void setHiddenValue() {
        this.hiddenValue = new RandomDataGenerator().nextInt(minValue, maxValue);
    }

    public List<Integer> getInputNumbers() {
        return inputNumbers;
    }

    public boolean checkValue(int inputValue) {
        inputNumbers.add(inputValue);
        if (inputValue < minValue || inputValue > maxValue)
            return false;
        if (inputValue == hiddenValue)
            return true;
        else if (inputValue > hiddenValue)
            maxValue = inputValue;
        else minValue = inputValue;
        return false;
    }
}
