package DERS04_Datacasting;

public class ders04_datacasting {

    public static void main(String[] args) {
        int a=134;
        double b=23.4;
        short c=34;
        byte d=14;

        double e=a;
        int f=c;
        short g=d;

        short h=(short) b;
        System.out.println("double 23.4 un short karsılıgı" +" "+ h);

        byte l=(byte) a;

        System.out.println("int 134'un byte karsılıgı :" + " "+l);

        int m=(int)b;

        System.out.println("double 23.4 un int karsılıgı : " + " "+m);
    }
}
