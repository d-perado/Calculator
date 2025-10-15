package com.calculator.lv3;

import java.util.ArrayList;

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
    public Double plus(T a, T b) {
        return (Double) a + (Double) b;
    }

    //뺄셈
    public Double minus(T a, T b) {
        return (Double) a - (Double) b;
    }

    //나눗셈
    public Double divid(T a, T b) {
        if (b.equals(0)) {
            return Double.POSITIVE_INFINITY;
        } else {
            return (Double) a / (Double) b;
        }
    }

    //곱셈
    public Double mul(T a, T b) {
        return (Double) a * (Double) b;
    }

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
    public void choiceBiggerNumber(T num) {
        if(this.results==null)return;
        ArrayList<Double> biggerNumbs = new ArrayList<>();
        this.results.forEach((result)->{
                if (result > num.doubleValue()) {
                    biggerNumbs.add(result);
                    System.out.println(biggerNumbs);
                }

    });
}
}
