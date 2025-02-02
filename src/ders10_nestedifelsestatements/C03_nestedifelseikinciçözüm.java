package ders10_nestedifelsestatements;

import java.util.Scanner;

public class C03_nestedifelseikinciçözüm {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen cınsıyetınızı gırınız : ");
        String cinsiyet=scan.nextLine();

        System.out.println("lutfen yasınızı gırınız : ");

        double yaş=scan.nextDouble();

        if(yaş<0||yaş>90){
            System.out.println("geçersiz yaş");

        }
        else if(yaş<60) {
            if (cinsiyet.equalsIgnoreCase("kadın")) {
                System.out.println("emekli olmak için " + (60 - yaş) + "yıl daha çalışman gerkmektedir");
            } else if (cinsiyet.equalsIgnoreCase("erkek")) {
                System.out.println("emekli olmak için " + (65 - yaş) + "yıl daha çalışman gerkmektedir");

            } else {
                System.out.println("cinsiyet girişi yanlış");
            }

        } else if (yaş<65) {
            if (cinsiyet.equalsIgnoreCase("kadın")) {
                System.out.println("emekli olabilir");
            } else if (cinsiyet.equalsIgnoreCase("erkek")) {
                System.out.println("emekli olmak için " + (65 - yaş) + "yıl daha çalışman gerkmektedir");

            } else {
                System.out.println("cinsiyet girişi yanlış");
            }





        }
        else{
            if (cinsiyet.equalsIgnoreCase("kadın")) {
                System.out.println("emekli olabilir");
            } else if (cinsiyet.equalsIgnoreCase("erkek")) {
                System.out.println("emekli olabilir");

            } else {
                System.out.println("cinsiyet girişi yanlış");
            }



        }
    }
}
