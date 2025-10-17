package com.calculator.refactoringCalculator.command;

import com.calculator.refactoringCalculator.model.CalculatorModel;

public class DivideCommand<T extends Number> implements Command {
    private CalculatorModel model;

    public DivideCommand(CalculatorModel model) {
        this.model = model;
    }


    @Override
    public <T extends Number> double execute(T a, T b) {
        return model.divide(a.doubleValue(), b.doubleValue());
    }
}
