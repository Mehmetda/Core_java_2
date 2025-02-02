package ders09_ifelsestatements;

import java.util.Scanner;

public class C05_ifelsestatements {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        System.out.println("lutfen bir tam sayı giriniz");
        int girilensayı=scan.nextInt();
         if(girilensayı%3==0&&girilensayı%5==0) System.out.println(" super sayı");


       else if(girilensayı%3==0) System.out.println("3 e bolunebılen sayı");
        else if(girilensayı%5==0) System.out.println("5 e bolunebılen sayı");


    }
}
