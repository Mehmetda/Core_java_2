package ders08_basitifcümleleri;

import java.util.Scanner;

public class C01_Ifstatements {

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("lütfen pozitif bir sayı giriniz : ");

        int girilensayı=scan.nextInt();

        if(girilensayı%5==0){

            System.out.println("girilen sayı 5 in tam katı ");
        }
    }
}
