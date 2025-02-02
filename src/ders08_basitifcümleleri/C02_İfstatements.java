package ders08_basitifcümleleri;

import java.util.Scanner;

public class C02_İfstatements {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("lutfen bir harf giriniz : ");

        char ilkharf=scan.next().charAt(0);

        if(ilkharf=='o'||ilkharf=='O'){
            System.out.println("Ocak");
        }
        if(ilkharf=='s'||ilkharf=='S'){
            System.out.println("Şubat");
        }
        if(ilkharf=='m'||ilkharf=='M'){
            System.out.println("Mart,Mayıs");
        }
        if(ilkharf=='n'||ilkharf=='N'){
            System.out.println("Nisan");
        }
        if(ilkharf=='h'||ilkharf=='H'){
            System.out.println("Haziran");
        }
        if(ilkharf=='t'||ilkharf=='T'){
            System.out.println("Temmuz");
        }
        if(ilkharf=='a'||ilkharf=='A'){
            System.out.println("Ağustos,Aralık");
        }
        if(ilkharf=='e'||ilkharf=='E'){
            System.out.println("Eylül,Ekim");
        }
        if(ilkharf=='k'||ilkharf=='K'){
            System.out.println("Kasım");
        }


    }
}
