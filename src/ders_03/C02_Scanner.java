package ders_03;

import java.util.Scanner;

public class C02_Scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        System.out.println("lutfen dairenin yarıcapını gırınız");

        double yarıçap=scan.nextDouble();

        double daireAlanı=3.14*yarıçap*yarıçap;

        System.out.println("dairenin alanı = "+ daireAlanı);
    }
}
