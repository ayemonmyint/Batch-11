package com.batcheleven.one;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        System.out.print("Enter a number:");
        Scanner sc = new Scanner(System.in);
        int userInput = sc.nextInt();

        if (userInput % 2 ==0){
            System.out.println("Your input number is even.");
        }else {
            System.out.println("Your input number is odd.");
        }

    }
}
