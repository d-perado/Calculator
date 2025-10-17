package com.calculator.refactoringCalculator.command;

public interface Command {
    <T extends Number> double execute(T a, T b);  // 제네릭 타입을 처리하는 execute 메서드
}
