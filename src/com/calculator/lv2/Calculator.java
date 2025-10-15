package com.calculator.lv2;

import java.util.ArrayList;

public class Calculator {
    //속성
    private ArrayList<Double> results; //계산된 결과값들

    //생성자
    Calculator(){

    }

    //기능
    //덧셈
    public int plus(Integer a, Integer b) {
        return a+b;
    }

    //뺄셈
    public int minus(Integer a, Integer b){
        return a-b;
    }

    //나눗셈
    public Double divid(Integer a, Integer b){
        if(b==0){
            return Double.POSITIVE_INFINITY;
        }
        else {
            return  a.doubleValue() / b.doubleValue();
        }
    }

    //곱셈
    public Integer mul(Integer a, Integer b){
        return a * b;
    }

    //getters

    public ArrayList<Double> getResults() {
        return results;
    }


    //setters
    public void setResults(ArrayList<Double> results) {
        this.results = results;
    }

    //가장 먼저 저장된 데이터 제거
    public void removeFirstData(){
        this.results.remove(0);
    }
}
