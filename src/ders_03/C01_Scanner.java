package ders_03;

import java.util.Scanner;

public class C01_Scanner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen isminizi giriniz");

        String kullanıcıİsim=scan.nextLine();

        System.out.println("Girilen kullanıcı ismi :" + kullanıcıİsim);
    }
}
