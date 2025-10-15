package com.calculator.lv3;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        ArithmeticCalculator arithmeticCalculator = new ArithmeticCalculator();


        Scanner sc = new Scanner(System.in);



        while (arithmeticCalculator.isCalculatorOnOFF()) {
            Operation operation = null;
            System.out.println("원하는 기능을 선택하세요.");
            System.out.println("1. 연산 2. 연산기록 보기 3. 연산기록 제거 4.입력값 보다 큰 수 exit. 종료");
            String input = sc.nextLine();
            switch (input) {
                case "1": {
                    System.out.println("정수를 입력하세요.");
                    String input1=sc.nextLine();
                    System.out.println("정수를 입력하세요.");
                    String input2=sc.nextLine();
                    System.out.println("사칙연산기호를 입력하세요.(+,-,/,*)");
                    String input3=sc.nextLine();
                    double num1 = 0;
                    double num2 = 0;

                    try {
                        num1 = Double.parseDouble(input1);
                        num2 = Double.parseDouble(input2);
                        operation = Operation.checkOper(input3);
                        switch (operation) {
                            case PLUS: {
                                System.out.println(arithmeticCalculator.plus(num1,num2));
                                arithmeticCalculator.addResult(arithmeticCalculator.plus(num1,num2));
                                break;
                            }
                            case MUL:
                                System.out.println(arithmeticCalculator.mul(num1,num2));
                                arithmeticCalculator.addResult(arithmeticCalculator.mul(num1,num2));
                                break;
                            case MINUS:
                                System.out.println(arithmeticCalculator.minus(num1,num2));
                                arithmeticCalculator.addResult(arithmeticCalculator.minus(num1,num2));
                                break;
                            case DIVIDE:
                                System.out.println(arithmeticCalculator.divid(num1,num2));
                                arithmeticCalculator.addResult(arithmeticCalculator.divid(num1,num2));
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
                    if (arithmeticCalculator.getResults() == null) {
                        System.out.println("연산기록이 없습니다.");
                        break;
                    }
                    System.out.println(arithmeticCalculator.getResults());
                    break;
                }
                case "3": {
                    arithmeticCalculator.removeFirstData();
                    break;
                }
                case "4":{
                    System.out.println("비교하고 싶은 수를 입력하세요.");
                    try{
                        Double input4=sc.nextDouble();
                        arithmeticCalculator.choiceBiggerNumber(input4);
                    } catch (Exception e){
                        System.out.println("올바른 수를 입력하세요.");
                    }
                    break;
                }
                case "exit": {
                    System.out.println("Test");
                    System.out.println("계산기가 종료됩니다.");
                    arithmeticCalculator.setCalculatorOnOFF();
                }
            }
        }
    }
}
