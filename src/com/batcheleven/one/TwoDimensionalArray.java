package com.batcheleven.one;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        int numbers[][]=new int[4][5];

        int dNumbers [][] = {
                {1,2,3,4,5,1,2,3},
                {5,4,3,2,1},
                {1,1,1,1,1000},
                {5,5,3,3,4}
        };
        System.out.println(dNumbers[2][4]);
        dNumbers[3][2]=7;
        System.out.println(dNumbers[3][2]);
        System.out.println(dNumbers.length);
        System.out.println(dNumbers[0].length);

        for (int i = 0; i < dNumbers[0].length; i++) {
            System.out.print(dNumbers[0][i]+"\t");

        }
        for(int row =0; row<dNumbers.length; row++){
            for (int col=0; col<dNumbers[row].length; col++){
                System.out.print(dNumbers[row][col]+"\t");
            }
            System.out.println();

        }
        for (int[] number:dNumbers){
            for (int n:number){
                System.out.print(n+"\t");
            }

        }//foreachloop


    }
}
