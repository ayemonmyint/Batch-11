package com.batcheleven.one;

import java.util.Scanner;

public class AreaOfCircle {


    public static void main(String[] args) {
        double A ;
        double pi = 3.14159265;

        System.out.print("Enter radius:");
        double userInputRadius = new Scanner(System.in).nextDouble();

        A = pi * userInputRadius * userInputRadius;
        System.out.println("Area of Circle is " + A);


    }
}
