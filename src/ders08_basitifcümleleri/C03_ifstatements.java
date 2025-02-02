package ders08_basitifcümleleri;

import java.util.Scanner;

public class C03_ifstatements {
    public static void main(String[] args) {
        Scanner scan=new Scanner (System.in);

        System.out.println("lütfen bir sayı giriniz:");
        int sayı=scan.nextInt();

        if(sayı%3==0){
            System.out.println("3 ile bolunme kontrol sonucu olumlu");
            System.out.println("sayı 3 ile bölünebiliyor");
        }
        if(sayı%5==0){
            System.out.println("5 ile bolunme kontrol sonucu olumlu");
            System.out.println("sayı 5 ile bölünebiliyor");
        }
    }
}
