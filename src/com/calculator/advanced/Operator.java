package com.calculator.advanced;

import java.util.Arrays;

public enum Operator {
    PLUS("+"),
    MINUS("-"),
    MUL("*"),
    DIVIDE("/");


    private final String userInput;

    Operator(String userInput){
        this.userInput=userInput;
    }

    public String getUserInput() {
        return userInput;
    }



    public static Operator getOperatorFromUser(String input){
        return Arrays.stream(Operator.values())
                .filter(operation -> operation.userInput.equals(input))
                .findAny()
                .orElseThrow(()->new IllegalArgumentException("연산자를 입력하세요"));
    }
}
