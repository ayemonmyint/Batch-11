package com.batcheleven.one;

public class CustomArrayCopy {
    public static void main(String[] args) {
        int numbers []= {1,2,3,4,5,6,7,18};//initialize an array

        int copy[]=new int[numbers.length];//receive array size {0,0,0,0,0,0,0,0}


        //before copy
        for (int i=0;i<copy.length;i++){
            System.out.print(copy[i]+"\t");
        }
        System.out.println();

        //after copy
        for (int i=0;i<numbers.length;i++){
            copy[i]=numbers[i];

        }
        for (int i=0;i<copy.length;i++){
            System.out.print(copy[i]+"\t");
        }

        //search the largest number in array

        int largestnumber =0;
        for (int i =0;i<numbers.length;i++){
            if (numbers[i]>largestnumber)
                largestnumber=numbers[i];



        }
        System.out.println(largestnumber);


        //search the smallest number in array
        int smallestNumber =5;
        for(int i=0;i<numbers.length;i++){
            if (numbers[i]<smallestNumber)
                smallestNumber=numbers[i];
        }
        System.out.println(smallestNumber);



    }

}
