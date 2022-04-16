package com.batcheleven.one;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        System.out.print("Enter Year:");
        int yr = new Scanner(System.in).nextInt();

        if (yr % 4 == 0){
            System.out.println(yr + " is Leap Year.");
        }else {
            System.out.println(yr + " is not Leap Year.");
        }
    }
}
