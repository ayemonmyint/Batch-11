package com.batcheleven.one;

public class ArrayCopy {
    public static void main(String[] args) {
        int numbers[]={1,2,3,9,8,7,5,4,3};

        int other[]= new int[6];
        System.arraycopy(numbers,2,other,2,4);
        for (int i =0; i<other.length; i++){
            System.out.println(other[i]);
        }


        int another[]= numbers.clone();
        for (int i =0; i<another.length;i++){
            System.out.print(another[i]+"\t");
        }


    }
}
//array=>object