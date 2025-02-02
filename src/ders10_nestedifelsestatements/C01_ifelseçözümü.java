package ders10_nestedifelsestatements;

import java.util.Scanner;

public class C01_ifelseçözümü {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen cınsıyetınızı gırınız : ");
       String cinsiyet=scan.nextLine();

        System.out.println("lutfen yasınızı gırınız : ");

        double yaş=scan.nextDouble();

        if(yaş<0||yaş>90){
            System.out.println("girilen yaş geçersiz");

        }
        else if(!(cinsiyet.equalsIgnoreCase("kadın")||cinsiyet.equalsIgnoreCase("erkek"))){
            System.out.println("gırılen cınsıyet gecersız");
        }
        else if(cinsiyet.equalsIgnoreCase("kadın")&&yaş>60){
            System.out.println("emekli olabilir");
        } else if (cinsiyet.equalsIgnoreCase("kadın")&&yaş<60) {
            System.out.println("emekli olmak için" +(60-yaş) +"yıl daha çalışman gerkmektedir");
        } else if (cinsiyet.equalsIgnoreCase("erkek")&&yaş>65) {
            System.out.println("emekli olabilir");
            
        } else if (cinsiyet.equalsIgnoreCase("erkek")&&yaş<65) {
            System.out.println("emekli olmak için" +(65-yaş) +"yıl daha çalışman gerkmektedir");


            
        }


    }
}
