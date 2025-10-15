package com.calculator.lv2;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner sc = new Scanner(System.in);

        System.out.println("원하는 기능을 선택하세요.");
        System.out.println("1. 연산 2. 연산기록 보기 3. 연산기록 제거 4. 종료");
        int input = sc.nextInt();
    }
}
