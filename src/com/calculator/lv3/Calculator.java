package com.calculator.lv3;

import java.util.ArrayList;

public class Calculator {
    //속성
    private ArrayList<String> results; //계산된 결과값들
    private boolean calculatorOnOFF;

    //생성자
    Calculator(){
        this.calculatorOnOFF=true;
        results=new ArrayList<>();
    }

    //기능
    //덧셈
    public <T extends Number> Double plus(T a, T b) {
        return (Double)a + (Double) b;
    }

    //뺄셈
    public <T extends Number> Double minus(T a, T b){
        return (Double)a - (Double) b;
    }

    //나눗셈
    public <T extends Number> Double divid(T a, T b){
        if(b.equals(0)){
            return Double.POSITIVE_INFINITY;
        }
        else {
            return  (Double)a / (Double) b;
        }
    }

    //곱셈
    public <T extends Number>Double mul(T a, T b)
    {
        return  (Double) a * (Double)b;
    }

    //getters
    //계산기 전원

    public boolean isCalculatorOnOFF() {
        return calculatorOnOFF;
    }

    //연산기록 조회
    public ArrayList<String> getResults() {
        return results;
    }

    //setters
    //계산기 전원 on/off
    public void setCalculatorOnOFF() {
        this.calculatorOnOFF = !calculatorOnOFF;
    }

    //연산기록변경
    public void setResults(ArrayList<String> results) {
        this.results = results;
    }

    //연산기록 추가
    public void addResult(String result){
        this.results.add(result);
    }

    //가장 먼저 저장된 데이터 제거
    public void removeFirstData(){
        this.results.remove(0);
    }
}
