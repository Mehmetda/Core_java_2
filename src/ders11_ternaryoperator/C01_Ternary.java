package ders11_ternaryoperator;

import java.util.Scanner;

public class C01_Ternary {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir tam sayı giriniz :");

        int girilensayı=scan.nextInt();
        System.out.println(girilensayı%5==0?"sayı 5 ın tam katı":"5 ın tam katı degıl");
    }
}
