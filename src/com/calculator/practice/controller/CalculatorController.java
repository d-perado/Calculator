package com.calculator.practice.controller;

import com.calculator.practice.command.*;
import com.calculator.practice.model.CalculatorModel;
import com.calculator.practice.model.Operation;
import com.calculator.practice.view.CalculatorView;
import com.calculator.practice.view.MenuOption;

import java.util.ArrayList;

public class CalculatorController {
    private CalculatorModel model = new CalculatorModel();
    private CalculatorView view = new CalculatorView();
    private ArrayList<Double> history = new ArrayList<>();
    boolean isCalculator = true;

    public void start() {
        while (isCalculator) {
            view.displayMenu();  // 메뉴 출력
            String userChoice = view.getUserChoice();

            // 종료 선택

            try {
                int choice = Integer.parseInt(userChoice) - 1;
                if (choice < 0 || choice >= MenuOption.values().length) {
                    throw new IllegalArgumentException("잘못된 선택입니다.");
                }

                MenuOption menuOption = MenuOption.values()[choice];
                menuOption.execute(this);
            } catch (Exception e) {
                System.out.println("오류: " + e.getMessage());
            }
        }
    }

    // 연산하기
    public void calculate() {
        Operation operations;

        System.out.print("연산자를 입력하세요.: (");
        for (Operation operator : Operation.values()) {
            if (operator.ordinal() == Operation.values().length - 1) {
                System.out.print(operator.getSymbol() + ")");
            } else {
                System.out.print(operator.getSymbol() + ", ");
            }
        }
        String operation = view.getUserChoice();
        boolean checkOperator = false;
        for(Operation operator : Operation.values()){
            if(operation.equals(operator.getSymbol())){
                checkOperator=true;
            }
        }
        if(!checkOperator){
            System.out.println("지원하지 않는 연산자 입니다.");
            return;
        }

        Number a = view.getNumber("첫 번째 숫자를 입력하세요: ");
        Number b = view.getNumber("두 번째 숫자를 입력하세요: ");

        Command command = null;
        for(Operation operator : Operation.values()){
            if(operation.equals(operator.getSymbol())){
                command=operator.getCommand(model);
            }
        }

        double result = command.execute(a, b);
        history.add(result);
        view.displayResult(result);
    }

    // 연산 기록 보기
    public void viewHistory() {
        view.displayHistory(history);
    }

    // 첫 번째 연산 기록 제거하기
    public void removeFirstRecord() {
        if (!history.isEmpty()) {
            history.remove(0);
            System.out.println("첫 번째 연산기록을 제거합니다");
            return;
        }
    }

    public void findLargerRecord() {
        Number a = view.getNumber("비교할 숫자를 입력하세요.");
        ArrayList<Double> results = new ArrayList<>();
        if (this.history.isEmpty()) {
            System.out.println("비교할 숫자가 존재하지 않습니다.");
            return;
        }
        for (Double arr : history) {
            if (arr.doubleValue() > a.doubleValue()) {
                results.add(arr);
            }
        }
        System.out.println(results);
    }

    public void exit() {
        System.out.println("정말로 종료하시려면 exit를 입력해주세요.");
        String userChoice = view.getUserChoice();
        if (userChoice.contains("exit")) {
            System.out.println("===계산기를 종료합니다.===");
            this.isCalculator = false;
        } else {
            System.out.println("===그대로 진행합니다.===");
        }
    }
}