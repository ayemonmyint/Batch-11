package com.batcheleven.one;

import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        System.out.print("Enter Celsius: ");
        double c = new Scanner(System.in).nextDouble();

        double fa = (c * 1.8)+32;
        System.out.println("Converted to Fahrenheit " + fa);

        System.out.print("Enter Fahrenheit :");
        double f = new Scanner(System.in).nextDouble();

        double cc = (f-32)/1.8;
        System.out.println("Converted to Celsius " + cc);
    }
}
