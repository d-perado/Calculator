package com.calculator.lv3;

public interface Calculator<T extends Number> {
    Double compute(T a, T b);
}
