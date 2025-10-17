package com.calculator.refactoringCalculator;

import com.calculator.refactoringCalculator.controller.CalculatorController;

public class App {
    public static void main(String[] args) {
        CalculatorController controller = new CalculatorController();
        controller.start();
    }
}
