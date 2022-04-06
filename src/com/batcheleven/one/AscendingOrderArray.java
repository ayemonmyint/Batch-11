package com.batcheleven.one;

public class AscendingOrderArray {
    public static void main(String[] args) {
        //smallest to largest
        int numbers[]={9,1,5,7,6,8,2};
        int valueNow=0;

        for (int i=0;i<numbers.length;i++){
            for (int j=i+1;j<numbers.length;j++){
                if (numbers[i]>numbers[j]){
                    valueNow=numbers[i];
                    numbers[i]=numbers[j];
                    numbers[j]=valueNow;
                }

            }
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);

        }

        System.out.println();
        System.out.println(numbers[numbers.length-2]);//find second largest number
        //largest to smallest
        int valN=0;
        for (int i=0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                if (numbers [i] < numbers[j]){
                    valN=numbers[i];
                    numbers[i]=numbers[j];
                    numbers[j]=valN;
                }
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);

        }



    }
}
