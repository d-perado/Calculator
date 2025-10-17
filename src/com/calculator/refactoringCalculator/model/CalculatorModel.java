package com.calculator.refactoringCalculator.model;

public class CalculatorModel {
    // 덧셈
    public double add(double a, double b) {
        return a + b;
    }

    // 뺄셈
    public double subtract(double a, double b) {
        return a - b;
    }

    // 곱셈
    public double multiply(double a, double b) {
        return a * b;
    }

    // 나눗셈
    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("0으로 나눌 수 없습니다.");
        }
        return a / b;
    }
}
