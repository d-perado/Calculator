package com.calculator.advanced;

public interface Calculator<T extends Number> {
    Double compute(T a, T b);
}
