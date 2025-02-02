package ders11_ternaryoperator;

import java.util.Scanner;

public class C03_TERNARY {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen notunuzu giriniz : ");

        double not = scan.nextDouble();
        System.out.println(not >= 50 ? "sınıfı geçtin" : "sınıfta kaldın");
    }
}
