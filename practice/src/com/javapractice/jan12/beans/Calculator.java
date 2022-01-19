package com.javapractice.jan12.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Calculator {
    int num1;
    int num2;

    public int add() {
        return this.num1 + this.num2;
    }

    public int subtract() {
        return this.num1 - this.num2;
    }
}
