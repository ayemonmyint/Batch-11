package com.batcheleven.one;


import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.print("Enter number: ");
        int a = new Scanner(System.in).nextInt();
        
        int fact =1;

        for (int i = 1; i <= a ; i++) {
            fact = fact *i;
        }
        System.out.println("Factorial of your input number is " + a);




    }
}
