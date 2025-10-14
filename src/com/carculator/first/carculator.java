package com.carculator.first;

import java.util.Scanner;

public class carculator {

    static boolean calcuratorPower = true;

    public static void main(String[] args) {
        System.out.println(":::계산기를 이용해주셔서 감사합니다.:::");
        System.out.println(":::종료를 원하시면 exit를 입력해주세요.:::");

        Scanner sc = new Scanner(System.in);

        while (calcuratorPower) {
            if (!sc.hasNext("exit")){


            } else {
                calcuratorPower = !calcuratorPower;
                System.out.println(":::계산기를 종료합니다.:::");
            }
        }

    }
}
