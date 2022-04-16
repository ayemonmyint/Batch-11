package com.batcheleven.one;

import java.util.Scanner;

public class AreaOfSquare {
    public static void main(String[] args) {
        int A;
        System.out.print("Enter height or base:");
        int userInput = new Scanner(System.in).nextInt();

        A = userInput * userInput;
        System.out.println("Area of Square : " + A);
    }
}
