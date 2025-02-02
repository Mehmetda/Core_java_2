package DERS04_Datacasting;

import java.util.Scanner;

public class C04_DataCasting {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("lütfen iki tam sayı giriniz:");

        int sayı_1=scan.nextInt();
        int sayı_2=scan.nextInt();

        int sonuç_1=sayı_1/sayı_2;
        System.out.println(sonuç_1);

        double sonuç_2=sayı_1/sayı_2;
        System.out.println(sonuç_2);

        double doğrusonuç=(double)sayı_1/sayı_2;
        System.out.println(doğrusonuç);
    }
}
