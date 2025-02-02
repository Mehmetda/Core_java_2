package ders06_increment_decrement;

public class C02_PreIncrement_PostIncremenet {

    public static void main(String[] args) {
        int sayı=10;

        int b=sayı;
        sayı++;
        System.out.println(b);
        System.out.println(sayı);

        int c=sayı++;
        System.out.println(c);

        System.out.println(sayı);

         c=++sayı;
        System.out.println(c);

        System.out.println(sayı);


    }
}
