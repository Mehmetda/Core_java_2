package ders12_switchstatements;

import java.util.Scanner;

public class C02_switchstatements2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir gün no giriniz :");
        int günno=scan.nextInt();
        switch (günno){
            case 1 :
                case 2 :
                    case 3 :
                        case 5:
                System.out.println("haftaiçi");break;
            case 6 :
                case 7 :
                System.out.println("haftasonu");break;
            default:
                System.out.println("geçersiz gün numarası");
        }

    }
}
