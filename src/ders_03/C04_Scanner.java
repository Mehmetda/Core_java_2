package ders_03;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {
        Scanner scan=new Scanner (System.in);

        System.out.println("Lütfen isminizi giriniz:");

        String isim =scan.nextLine();

        System.out.println("lutfen soyisminizi giriniz");

        String soyisim=scan.nextLine();

        System.out.println("lutfen yasınızı giriniz:");

        int yaş=scan.nextInt();

        System.out.println("Girilen Bilgiler:  "+ isim.charAt(0) +" " +soyisim +", "+yaş);




    }
}
