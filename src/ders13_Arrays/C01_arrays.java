package ders13_Arrays;

import java.util.Arrays;

public class C01_arrays {
    public static void main(String[] args) {
        int[]sayılar=new int[4];
        System.out.println(Arrays.toString(sayılar));
        String str="java çok güzel";

        String[]kelimeler=str.split(" ");
        System.out.println(Arrays.toString(kelimeler));

        String[]kelimeler2=str.split("a");
        System.out.println(Arrays.toString(kelimeler2));

        String[]kelimeler3=str.split("çok");
        System.out.println(Arrays.toString(kelimeler3));

        String[]kelimeler4=str.split("");
        System.out.println(Arrays.toString(kelimeler4));

        int[]sayılar1={1,2,3};



    }
}
