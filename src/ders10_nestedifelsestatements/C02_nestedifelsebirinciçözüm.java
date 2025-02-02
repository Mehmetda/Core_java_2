package ders10_nestedifelsestatements;

import java.util.Scanner;

public class C02_nestedifelsebirinciçözüm {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen cınsıyetınızı gırınız : ");
        String cinsiyet=scan.nextLine();

        System.out.println("lutfen yasınızı gırınız : ");

        double yaş=scan.nextDouble();
        if(cinsiyet.equalsIgnoreCase("kadın")){
            if(yaş<0||yaş>90){
                System.out.println("yaş girişi geçersiz");
            } else if (yaş<60) {
                System.out.println("emekli olmak için " +(60-yaş) +"yıl daha çalışman gerkmektedir");
                
            }
            else {
                System.out.println("emekli olabilir");
            }

        }
        else if(cinsiyet.equalsIgnoreCase("erkek")){
            if(yaş<0||yaş>90){
                System.out.println("yaş girişi geçersiz");
            } else if (yaş<65) {
                System.out.println("emekli olmak için " +(65-yaş) +"yıl daha çalışman gerkmektedir");

            }
            else {
                System.out.println("emekli olabilir");
            }


        }
        else {
            System.out.println("cınsıyet gırısı hatalı");
        }


    }
}
