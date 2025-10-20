package com.calculator.lv2;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();


        Scanner sc = new Scanner(System.in);

        while (calculator.isCalculatorOnOFF()) {
            System.out.println("원하는 기능을 선택하세요.");
            System.out.println("1. 연산 2. 연산기록 보기 3. 연산기록 제거 exit. 종료");
            String input = sc.nextLine();
            switch (input) {
                case "1": {
                    System.out.println("정수를 입력하세요.");
                    String input1=sc.nextLine();
                    System.out.println("정수를 입력하세요.");
                    String input2=sc.nextLine();
                    System.out.println("사칙연산기호를 입력하세요.(+,-,/,*)");
                    String input3=sc.nextLine();
                    int num1 = 0;
                    int num2 = 0;

                    try {
                        num1 = Integer.parseInt(input1);
                        num2 = Integer.parseInt(input2);
                        switch (input3) {
                            case "+": {
                                System.out.println(calculator.plus(num1,num2));
                                calculator.addResult(calculator.plus(num1,num2).toString());
                                break;
                            }
                            case "*":
                                System.out.println(calculator.mul(num1,num2));
                                calculator.addResult(calculator.mul(num1,num2).toString());
                                break;
                            case "-":
                                System.out.println(calculator.minus(num1,num2));
                                calculator.addResult(calculator.minus(num1,num2).toString());
                                break;
                            case "/":
                                System.out.println(calculator.divid(num1,num2));
                                calculator.addResult(calculator.divid(num1,num2).toString());
                                break;
                            default:
                                System.out.println(":::올바른 사칙연산기호를 입력해주세요.:::");
                        }
                    } catch (Exception e) {
                        System.out.println(":::숫자를 제대로 입력해주세요.:::");
                    }
                    break;
                }
                case "2": {
                    if (calculator.getResults().isEmpty()) {
                        System.out.println("연산기록이 없습니다.");
                        break;
                    }
                    System.out.println(calculator.getResults());
                    break;
                }
                case "3": {
                    calculator.removeFirstData();
                    break;
                }
                case "exit": {
                    System.out.println("계산기가 종료됩니다.");
                    calculator.setCalculatorOnOFF();
                }
            }
        }
    }
}
