package com.calculator.refactoringCalculator.view;

import java.util.ArrayList;
import java.util.Scanner;

public class CalculatorView {
    private Scanner scanner = new Scanner(System.in);

    // 메뉴 출력
    public void displayMenu() {
        System.out.println("=== 계산기 메뉴 ===");
        for (MenuOption option : MenuOption.values()) {
            System.out.println((option.ordinal() + 1) + ". " + option.getDescription());
        }
        System.out.print("메뉴를 선택하세요: ");
    }

    // 숫자 입력 받기
    public Number getNumber(String prompt) {
        System.out.print(prompt);
        String input = scanner.nextLine();
        if (input.contains(".")) {
            return Double.parseDouble(input);
        }
        return Integer.parseInt(input);
    }

    // 연산 기록 보기
    public void displayHistory(ArrayList<Double> history) {
        System.out.println("\n=== 계산 기록 ===");
        if (history.isEmpty()) {
            System.out.println("기록이 없습니다.");
        } else {
            for (int i = 0; i < history.size(); i++) {
                System.out.println((i + 1) + ": " + history.get(i));
            }
        }
    }

    // 결과 출력
    public void displayResult(double result) {
        System.out.println("계산 결과: " + result);
    }

    // 사용자 선택 받기
    public String getUserChoice() {
        return scanner.nextLine();
    }

    // 제거할 연산 기록 번호 받기
    public int getRecordIndexToRemove() {
        System.out.print("제거할 연산 기록 번호를 입력하세요: ");
        return Integer.parseInt(scanner.nextLine()) - 1;
    }

    // 찾을 값 입력 받기
    public double getValueForComparison() {
        System.out.print("비교할 값을 입력하세요: ");
        return Double.parseDouble(scanner.nextLine());
    }
}
