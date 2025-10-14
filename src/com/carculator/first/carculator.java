package com.carculator.first;

import java.util.Scanner;

public class carculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println(":::정수입력 하세요.:::");
            String input1 = sc.nextLine();
            if (input1.contains("exit")) {
                System.out.println(":::계산기를 종료합니다.:::");
                break;
            }
            System.out.println(":::정수입력 하세요.:::");
            String input2 = sc.nextLine();
            if (input2.contains("exit")) {
                System.out.println(":::계산기를 종료합니다.:::");
                break;
            }
            System.out.println(":::사칙연산기호를 입력하세요.(+,-,/,*):::");
            String input3 = sc.nextLine();
            if (input3.contains("exit")) {
                System.out.println(":::계산기를 종료합니다.:::");
                break;
            }

            int num1 = 0;
            int num2 = 0;

            try {
                num1 = Integer.parseInt(input1);
                num2 = Integer.parseInt(input2);
                switch (input3) {
                    case "+":
                        System.out.println(num1 + num2);
                        break;
                    case "*":
                        System.out.println(num1 * num2);
                        break;
                    case "-":
                        System.out.println(num1 - num2);
                        break;
                    case "/":
                        if(num2==0){
                            System.out.println(":::분모는 0이 될 수 없습니다.:::");
                            break;
                        }
                        System.out.println((double)num1 / (double)num2);
                        break;
                    default:
                        System.out.println(":::올바른 사칙연산기호를 입력해주세요.:::");
                }
            } catch (Exception e) {
                System.out.println(":::숫자를 제대로 입력해주세요.:::");
            }

        }
    }
}
