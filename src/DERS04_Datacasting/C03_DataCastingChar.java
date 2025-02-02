package DERS04_Datacasting;

import java.util.Scanner;

public class C03_DataCastingChar {
    public static void main(String[] args) {
        int a= 'a'+'b';
        System.out.println(a);
        System.out.println('a'+'b');

        System.out.println(""+'a'+'b');
        Scanner scan=new Scanner (System.in);

        System.out.println("lütfen bir karakter giriniz:");

        char harf=scan.nextLine().charAt(0);
        System.out.println("girilen karakterin bir fazlası :" + (char)(harf+1));
        System.out.println("girilen karakterin bir fazlası :" + (char)(harf+2));
        System.out.println("girilen karakterin bir fazlası :" + (char)(harf+3));
    }
}
