package com.calculator.refactoringCalculator.command;

import com.calculator.refactoringCalculator.model.CalculatorModel;

public class SquareCommand<T extends Number> implements Command {
    private CalculatorModel model;

    public SquareCommand(CalculatorModel model) {
        this.model = model;
    }

    @Override
    public <T extends Number> double execute(T a, T b) {
        return model.square(a.doubleValue(), b.doubleValue());
    }
}
