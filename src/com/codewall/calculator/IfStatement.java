package com.codewall.calculator;

public class IfStatement {
    public static void main(String[] args) {
        int mark = 90;
        if (mark<40){
            System.out.println("fail");
        }else if(mark >=40 && mark <=80){
            System.out.println("pass");
        }else {
            System.out.println("D");
        }

    }
}
