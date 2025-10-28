package com.calculator.lv3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArithmeticCalculator<T extends Number> {
    //속성
    private List<Double> results; //계산된 결과값들
    private boolean isCarculator;

    //생성자
    ArithmeticCalculator() {
        this.isCarculator = true;
        results = new ArrayList<>();
    }

    //기능
    //덧셈
    Calculator<T> plus = (T a, T b) -> a.doubleValue() + b.doubleValue();

    //뺄셈
    Calculator<T> minus = (T a, T b) -> a.doubleValue() + b.doubleValue();

    //나눗셈
    Calculator<T> divide = (T a, T b) -> {
        if (b.equals(0)) {
            return Double.POSITIVE_INFINITY;
        } else {
            return a.doubleValue() / b.doubleValue();
        }
    };

    //곱셈
    Calculator<T> mul = (T a, T b) -> a.doubleValue() + b.doubleValue();

    //getters
    //계산기 전원
    public boolean isCarculatorOn() {
        return isCarculator;
    }

    //연산기록 조회
    public List<Double> getResults() {
        return results;
    }
    public double getMinus(T a, T b){
        return minus.compute(a,b);
    }
    public double getPlus(T a, T b){
        return plus.compute(a,b);
    }

    public double getDivide(T a, T b){
        return divide.compute(a,b);
    }

    public double getMul(T a, T b){
        return mul.compute(a,b);
    }

    //setters
    //계산기 전원 on/off
    public void setisCarculator() {
        this.isCarculator = !isCarculator;
    }

    //연산기록 추가
    public void addResult(Double result) {
        this.results.add(result);
    }

    //가장 먼저 저장된 데이터 제거
    public void removeFirstData() {
        if (this.results.isEmpty()) {
            System.out.println("제거할 데이터가 없습니다.");
            return;
        }
        this.results.remove(0);
    }

    //입력 받은 수보다 큰 수만 출력하기
    public void printBiggerNumber(T num) {
        if (this.results == null) return;

        ArrayList<Double> temp = new ArrayList<>();
        for (Double result:results){
            temp.add(result);
        }
        System.out.println(temp.stream()
                .filter((value) -> (value > num.doubleValue()))
                .collect(Collectors.toList()));
        temp.clear();
    }

}
