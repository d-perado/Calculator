package com.calculator.refactoringCalculator.command;

import com.calculator.refactoringCalculator.model.CalculatorModel;

public class AddCommand<T extends Number> implements Command {
    private CalculatorModel model;

    public AddCommand(CalculatorModel model) {
        this.model = model;
    }

    @Override
    public <T extends Number> double execute(T a, T b) {
        return model.add(a.doubleValue(), b.doubleValue());
    }
}
