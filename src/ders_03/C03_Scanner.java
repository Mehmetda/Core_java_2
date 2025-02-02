package ders_03;

import java.util.Scanner;

public class C03_Scanner {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("lutfen bir kelime gir:");

        char ilkHarf=scan.next().charAt(0);
        System.out.println("girilen kelimenin ilk harf : " + ilkHarf);
    }
}
