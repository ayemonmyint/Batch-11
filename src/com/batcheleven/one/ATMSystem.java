package com.batcheleven.one;

import java.util.Scanner;

public class ATMSystem {
    public static void main(String[] args) {
       double balance = 100000;
       double withdraw,deposit;

      Scanner sc = new Scanner(System.in);


       while (true){
           System.out.println("Choose 1 for Withdraw");
           System.out.println("Choose 2 for Deposit");
           System.out.println("Choose 3 for CheckBalance");
           int i = sc.nextInt();

           switch (i){
               case 1:
                   System.out.print("Enter amount for Withdraw");
                   withdraw = sc.nextInt();
                   if (balance>=withdraw){
                       balance=balance-withdraw;
                       System.out.println("Take Your money.Have a nice day!");
                   }else {
                       System.out.println("Insufficient Balance");
                   }
                   break;
               case 2:
                   System.out.println("Enter amount for Deposit");
                   deposit = sc.nextInt();
                   balance= balance+deposit;
                   System.out.println("Success.");
                   break;

               case 3:
                   System.out.println("Current Balance :" + balance);
                   break;

               default:
                   System.out.println("Something Wrong");

           }
       }





    }
}
