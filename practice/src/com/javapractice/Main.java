package com.javapractice;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("press 1 to convert from f to c, \n" +
                "press 2 to convert from c to f:");
        int reply = scan.nextInt();
        if (reply == 1) {
            System.out.println("how many degrees f would you like to convert:");
            int degrees = scan.nextInt();
            double celsius = (degrees - 32) * (5. / 9.);
            System.out.println("celsius: " + celsius);
        } else if (reply == 2) {
            System.out.println("how many degrees c would you like to convert:");
            int degrees = scan.nextInt();
            double fahrenheit = (degrees * 9. / 5.) + 32;
            System.out.println("fahrenheit: " + fahrenheit);
        }

    }
}
