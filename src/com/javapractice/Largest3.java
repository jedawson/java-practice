package com.javapractice;

import java.util.Scanner;

public class Largest3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number #1:");
        int one = scanner.nextInt();
        System.out.println("enter number #2:");
        int two = scanner.nextInt();
        System.out.println("enter number #3:");
        int three = scanner.nextInt();
        System.out.println("The largest number is " + Math.max(one, Math.max(two, three)));
    }
}
