package com.calculator.practice.command;

import com.calculator.practice.model.CalculatorModel;

public class SubtractCommand<T extends Number> implements Command {
    private CalculatorModel model;

    public SubtractCommand(CalculatorModel model) {
        this.model = model;
    }

    @Override
    public <T extends Number> double execute(T a, T b) {
        return model.subtract(a.doubleValue(), b.doubleValue());}
    }
