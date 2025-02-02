package ders09_ifelsestatements;

import java.util.Scanner;

public class C03_ifelsestatements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen notunuzu giriniz:");

        double not=scan.nextDouble();
        if(not>100||not<0){
            System.out.println("geçersiz not");
        }

        else if(not>=85){
            System.out.println("AA");
        }
        else if(not>=65){
            System.out.println("BB");

        }
        else if(not>=50){
            System.out.println("CC");

        }
        else{
            System.out.println("DD");

        }
    }
}
