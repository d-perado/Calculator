package com.calculator.lv3;

@FunctionalInterface
public interface Calculatior<T extends Number> {
    Double compute(T a, T b);
}
