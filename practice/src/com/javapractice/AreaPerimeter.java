package com.javapractice;

import java.util.Scanner;

public class AreaPerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("press 1 for triangle, \n" +
                "press 2 for rectangle:");
        int reply = scanner.nextInt();
        if (reply == 1) {
            System.out.println("what is the base:");
            int base = scanner.nextInt();
            System.out.println("what is the height:");
            int height = scanner.nextInt();
            double area = 0.5 * base * height;
            System.out.println("area is: " + area);
            double perimeter = base + height + Math.sqrt(base * base + height * height);
            System.out.println("perimeter is: " + perimeter);
        } else if (reply == 2) {
            System.out.println("what is the base:");
            int base = scanner.nextInt();
            System.out.println("what is the height:");
            int height = scanner.nextInt();
            double area = base * height;
            System.out.println("area is: " + area);
            double perimeter = (base + height) * 2;
            System.out.println("perimeter is: " + perimeter);
        }
    }
}
