package com.batcheleven.one;

public class JavaArray {
    public static void main(String[] args) {
        int a = 88; //variable initialization
        int b; // delcare
        String name = "zkdlin";
        int numbers [] = {14,24,37,42,54,65,77}; //array initialize
        String names[]=new String[]{"exo","suho","kai","chanyeol","chen","sehun"};

        String cars[]=new String[5];
        cars[0]="Toyota1";
        cars[1]="Toyota2";
        cars[4] = "Toyota 4";

        System.out.println(cars.length);
        System.out.println(names.length);
        names[1]= "pages";
        System.out.println(names[1]);


        System.out.println(numbers[4]);//access
        numbers[2]=888;
        System.out.println(numbers[2]);
        System.out.println(names[3]);
        System.out.println(names);
        System.out.println(numbers);

        for(int i =0; i< names.length; i++){
            System.out.print(names[i]+"\t");
        }
        for (String s : names) {
            System.out.println(s);
            System.out.println();


        }//foreachloop
        for (int i = names.length - 1; i >= 0; i--) {
            System.out.println(names[i]);

        }//reverse





    }
}





//Array =>store same data type
//one dimensional array
//two or multidimensional array
//jagged array
//A jagged array is an array of arrays such that member arrays can be of different sizes,
// i.e., we can create a 2-D array but with a variable number of columns in each row.
// These types of arrays are also known as Jagged arrays.

