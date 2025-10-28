package com.calculator.lv3;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        ArithmeticCalculator arithmeticCalculator = new ArithmeticCalculator();

        Scanner sc = new Scanner(System.in);

        while (arithmeticCalculator.isCarculatorOn()) {
            Operation operation = null;

            System.out.println("원하는 기능을 선택하세요.");
            System.out.println("1. 연산 2. 연산기록 보기 3. 연산기록 제거 4.입력값 보다 큰 수 exit. 종료");
            String input = sc.nextLine();
            switch (input) {

                case "1": {
                    displayCalculate(sc, arithmeticCalculator);
                    break;
                }
                case "2" : {
                    displayCalculateHistory(arithmeticCalculator);
                    break;
                }
                case "3" : {
                    arithmeticCalculator.removeFirstData();
                    break;
                }
                case "4" : {
                    displayCompareTo(sc, arithmeticCalculator);
                    break;
                }
                case "exit": {
                    displayExit(arithmeticCalculator);
                }
            }
        }
    }

    private static void displayExit(ArithmeticCalculator arithmeticCalculator) {
        System.out.println("계산기가 종료됩니다.");
        arithmeticCalculator.setisCarculator();
    }

    private static void displayCompareTo(Scanner sc, ArithmeticCalculator arithmeticCalculator) {
        System.out.println("비교하고 싶은 수를 입력하세요.");
        try{
            Double input4=Double.parseDouble(sc.nextLine());
            arithmeticCalculator.printBiggerNumber(input4);
        } catch (Exception e) {
            System.out.println("올바른 수를 입력하세요.");
        }
    }

    private static void displayCalculateHistory(ArithmeticCalculator arithmeticCalculator) {
        if (arithmeticCalculator.getResults().isEmpty()) {
            System.out.println("연산기록이 없습니다.");
            return;
        }
        System.out.println(arithmeticCalculator.getResults());
    }

    private static void displayCalculate(Scanner sc, ArithmeticCalculator arithmeticCalculator) {
        Operation operation;
        System.out.println("숫자를 입력하세요.");
        String input1= sc.nextLine();
        System.out.println("숫자를 입력하세요.");
        String input2= sc.nextLine();
        System.out.println("사칙연산기호를 입력하세요.(+,-,/,*)");
        String input3= sc.nextLine();
        double num1 = 0;
        double num2 = 0;

        try {
            num1 = Double.parseDouble(input1);
            num2 = Double.parseDouble(input2);
            operation = Operation.checkOperation(input3);
            double result = 0;
            switch (operation) {
                case PLUS: {
                    result = arithmeticCalculator.getPlus(num1, num2);
                    System.out.println(result);
                    arithmeticCalculator.addResult(result);
                    break;
                }
                case MUL:
                    result = arithmeticCalculator.getMul(num1, num2);
                    System.out.println(result);
                    arithmeticCalculator.addResult(result);
                    break;
                case MINUS:
                    result = arithmeticCalculator.getMinus(num1, num2);
                    System.out.println(result);
                    arithmeticCalculator.addResult(result);
                    break;
                case DIVIDE:
                    result = arithmeticCalculator.getDivide(num1, num2);
                    System.out.println(result);
                    arithmeticCalculator.addResult(result);
                    break;
                default:
                    System.out.println(":::올바른 사칙연산기호를 입력해주세요.:::");
            }
        } catch (Exception e) {
            System.out.println(":::숫자를 제대로 입력해주세요.:::");
        }
    }
}
