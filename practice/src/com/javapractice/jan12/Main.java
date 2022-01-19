package com.javapractice.jan12;

import com.javapractice.jan12.beans.Calculator;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(3,2);
        System.out.println(calculator.add());
        System.out.println(calculator.subtract());
    }
}
