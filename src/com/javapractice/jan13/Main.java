package com.javapractice.jan13;

public class Main {
    public static void main(String[] args) {
        FunctionalInterface adding = (int n1, int n2) -> {return n1 + n2;};
        int result = adding.method(1,2);
        System.out.println(result);

    }
}
