package ders11_ternaryoperator;

import java.util.Scanner;

public class C02_Ternary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("lütfen bir karakter giriniz :");
        char karakter=scan.nextLine().charAt(0);
        System.out.println();
        System.out.println(karakter >= 'a' && karakter <= 'z' ? (char)(karakter - 32) : (char)karakter);


    }
}
