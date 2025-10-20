package com.calculator.refactoringCalculator.model;

import com.calculator.refactoringCalculator.command.*;

public enum Operation {
    ADD("+") {
        @Override
        public <T extends Number> Command getCommand(CalculatorModel model) {
            return new AddCommand<>(model);
        }
    },
    SUBTRACT("-") {
        @Override
        public <T extends Number> Command getCommand(CalculatorModel model) {
            return new SubtractCommand<>(model);
        }
    },
    MULTIPLY("*") {
        @Override
        public <T extends Number> Command getCommand(CalculatorModel model) {
            return new MultiplyCommand<>(model);
        }
    },
    DIVIDE("/") {
        @Override
        public <T extends Number> Command getCommand(CalculatorModel model) {
            return new DivideCommand<>(model);
        }
    },
    SQUARE("^") {
        @Override
        public <T extends Number> Command getCommand(CalculatorModel model) { return new SquareCommand<>(model);
        }
    };

    private String symbol;

    Operation(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }

    // 기호에 해당하는 연산을 반환하는 메서드
    public static Operation fromSymbol(String symbol) {
        for (Operation operation : Operation.values()) {
            if (operation.symbol.equals(symbol)) {
                return operation;
            }
        }
        throw new IllegalArgumentException("지원하지 않는 연산자입니다.");
    }

    // 각 연산에 해당하는 커맨드를 반환하는 추상 메서드
    public abstract <T extends Number> Command getCommand(CalculatorModel model);
}
