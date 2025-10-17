package com.calculator.refactoringCalculator.view;

import com.calculator.refactoringCalculator.controller.CalculatorController;

import java.util.ArrayList;

public enum MenuOption {
    CALCULATE("연산하기") {
        @Override
        public void execute(CalculatorController controller) {
            controller.calculate();
        }
    },
    VIEW_HISTORY("연산 기록 보기") {
        @Override
        public void execute(CalculatorController controller) {
            controller.viewHistory();
        }
    },
    REMOVE_FIRST("첫 번째 연산 기록 제거") {
        @Override
        public void execute(CalculatorController controller) {
            controller.removeFirstRecord();
        }
    },
    FIND_LARGER("입력값보다 큰 연산 기록 찾기") {
        @Override
        public void execute(CalculatorController controller) {
            controller.findLargerRecord();
        }
    },
    EXIT("종료") {
        @Override
        public void execute(CalculatorController controller) {
            controller.exit();
        }
    };

    private String description;

    MenuOption(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    // 메뉴 항목에 대한 실행 로직을 추상화
    public abstract void execute(CalculatorController controller);

    // 메뉴 항목을 선택하는 메서드
    public static MenuOption fromDescription(String description) {
        for (MenuOption option : MenuOption.values()) {
            if (option.description.equals(description)) {
                return option;
            }
        }
        throw new IllegalArgumentException("올바른 메뉴를 입력하세요.");
    }
}
