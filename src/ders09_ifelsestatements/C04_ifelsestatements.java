package ders09_ifelsestatements;

import java.util.Scanner;

public class C04_ifelsestatements {
    public static void main(String[] args) {
        Scanner scan=new Scanner (System.in);
        System.out.println("lutfen agırlıgınızı gırınız: ");
        double ağırlık=scan.nextDouble();
        System.out.println("lutfen boyunuzu gırınız: ");
        double boy=scan.nextDouble();

        double vke=ağırlık*10000/(boy*boy);

        System.out.println("vucut lilo endexsınız :" + vke);

        if(vke>=30) System.out.println("obez");
        else if(vke>=25) System.out.println("kilolu");
        else if(vke>=20) System.out.println("normal");
        else System.out.println("zayıf");
    }
}
