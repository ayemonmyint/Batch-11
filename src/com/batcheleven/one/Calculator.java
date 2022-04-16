package com.batcheleven.one;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.print("Enter number 1: ");
        int num1 = new Scanner(System.in).nextInt();


        System.out.print("Enter operator: ");
        String op = new Scanner(System.in).nextLine();

        System.out.print("Enter number 2: ");
        int num2 = new Scanner(System.in).nextInt();



        if (op.equals("+")){
            mySum(num1,num2);
        }
        if (op.equals("-")){
            mySubstruction(num1,num2);
        }
        if (op.equals("*")){
            myMultiply(num1,num2);
        }
        if (op.equals("/")){
            myDevision(num1,num2);
        }

    }

    static void mySum(int num1, int num2){
        System.out.println(num1 +num2);
    }

    static void mySubstruction (int num1 , int num2){
        System.out.println(num1 - num2);
    }

    static void myMultiply(int num1 , int num2){
        System.out.println(num1*num2);
    }

    static void myDevision(int num1, int num2){
        System.out.println(num1/num2);
    }
}
