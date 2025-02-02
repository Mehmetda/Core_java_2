package ders12_switchstatements;

import java.util.Scanner;

public class C03_switchstatements3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir ay numarası giriniz :");
        int ayno=scan.nextInt();
        switch (ayno){
            case 12:
            case 1:
            case 2:
                System.out.println("kış");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("ilkbahar");
                break;
            case 6:
            case 7:
            case 8 :
                System.out.println("yaz");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("sonbahar");
                break;
            default:
                System.out.println("geçeriz ay numarası");
        }
    }
}
