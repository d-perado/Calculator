package com.calculator.refactoringCalculator.command;

import com.calculator.refactoringCalculator.model.CalculatorModel;

public class SubtractCommand<T extends Number> implements Command {
    private CalculatorModel model;

    public SubtractCommand(CalculatorModel model) {
        this.model = model;
    }

    @Override
    public <T extends Number> double execute(T a, T b) {
        return model.subtract(a.doubleValue(), b.doubleValue());}
    }
