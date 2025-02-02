package ders05_WrapperClass_Matematikselİşlemler;

import java.util.Scanner;

public class C02_WrapperClasses {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("lütfen dört basamaklı bir sayı giriniz : ");

        int sayı =scan.nextInt();

        int birlerbasamağı=sayı%10;

        sayı=sayı/10;

        int onlarbasamağı=sayı%10;
        sayı=sayı/10;
        int yüzlerbasamağı=sayı%10;
        sayı=sayı/10;
        System.out.println(birlerbasamağı+onlarbasamağı+yüzlerbasamağı+sayı);






    }
}
