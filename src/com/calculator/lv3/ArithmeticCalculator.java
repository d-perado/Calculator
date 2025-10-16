package com.calculator.lv3;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class ArithmeticCalculator<T extends Number> {
    //속성
    private ArrayList<Double> results; //계산된 결과값들
    private boolean calculatorOnOFF;

    //생성자
    ArithmeticCalculator() {
        this.calculatorOnOFF = true;
        results = new ArrayList<>();
    }

    //기능
    //덧셈
    Calculator<T> plus = (T a, T b) -> a.doubleValue() +  b.doubleValue();

    //뺄셈
    Calculator<T> minus = (T a, T b) -> a.doubleValue() +  b.doubleValue();

    //나눗셈
    Calculator<T> divid = (T a, T b) -> {
        if(b.equals(0)){
            return Double.POSITIVE_INFINITY;
        } else {
            return a.doubleValue() / b.doubleValue();
        }
    };

    //곱셈
    Calculator<T> mul = (T a,T b) -> a.doubleValue() +  b.doubleValue();

    //getters
    //계산기 전원
    public boolean isCalculatorOnOFF() {
        return calculatorOnOFF;
    }

    //연산기록 조회
    public ArrayList<Double> getResults() {
        return results;
    }

    //setters
    //계산기 전원 on/off
    public void setCalculatorOnOFF() {
        this.calculatorOnOFF = !calculatorOnOFF;
    }

    //연산기록변경
    public void setResults(ArrayList<Double> results) {
        this.results = results;
    }

    //연산기록 추가
    public void addResult(Double result) {
        this.results.add(result);
    }

    //가장 먼저 저장된 데이터 제거
    public void removeFirstData() {
        this.results.remove(0);
    }

    //입력 받은 수보다 큰 수만 출력하기
    public void printBiggerNumber(T num) {
        if(this.results==null)return;
        System.out.println(this.results.stream()
                .filter((value)->(value>num.doubleValue()))
                .collect(Collectors.toList()));}

}
