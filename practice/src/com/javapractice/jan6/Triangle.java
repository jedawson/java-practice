package com.javapractice.jan6;

public class Triangle extends Polygon{

    @Override
    double getArea() {
        return .5 * dim1 * dim2;
    }
}
