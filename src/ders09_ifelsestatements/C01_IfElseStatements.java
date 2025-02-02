package ders09_ifelsestatements;

import java.util.Scanner;

public class C01_IfElseStatements {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        System.out.println("üçgen kenar \nuzunluklarını yazınız : ");

        double kenar1=scan.nextDouble();
        double kenar2=scan.nextDouble();
        double kenar3=scan.nextDouble();

        if(kenar1==kenar2  && kenar2==kenar3){
            System.out.println("eşkenar üçgen");

        }
        else{
            System.out.println("Eşkenar üçgen değil ");
        }



    }
}
