package ders11_ternaryoperator;

import java.util.Scanner;

public class C04_NESTEDTERNARY {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen notunuzu giriniz : ");

        int not =scan.nextInt();

        System.out.println(not > 0 ? not % 2 == 0 ? "çift sayı " : "tek sayı" : not <= -100 && not > -1000 ? "üç basamaklı" : "üç basamaklı değil");

    }
}
