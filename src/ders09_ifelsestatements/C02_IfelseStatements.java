package ders09_ifelsestatements;

import java.util.Scanner;

public class C02_IfelseStatements {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("lütfen notunuzu giriniz");

        double not =scan.nextDouble();
        if(not>=50){
            System.out.println("sınıfı geçtin");
        }
        else {
            System.out.println("maalesef kaldın");
        }

    }
}
