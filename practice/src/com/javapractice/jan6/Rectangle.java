package com.javapractice.jan6;

public class Rectangle extends Polygon{
    @Override
    double getArea() {
        return dim1 * dim2;
    }
}
