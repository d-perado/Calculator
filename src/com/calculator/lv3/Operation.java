package com.calculator.lv3;

import java.util.Arrays;
import java.util.function.BiFunction;

public enum Operation {
    PLUS("+"),
    MINUS("-"),
    MUL("*"),
    DIVIDE("/");


    private final String userInput;

    Operation(String userInput){
        this.userInput=userInput;
    }

    public String getUserInput() {
        return userInput;
    }



    public static Operation checkOperation(String input){
        return Arrays.stream(Operation.values())
                .filter(operation -> operation.userInput.equals(input))
                .findAny()
                .orElseThrow(()->new IllegalArgumentException("연산자를 입력하세요"));
    }
}
