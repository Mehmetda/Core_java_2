package Methodlar;

public class C01_methodlar {
    public static void main(String[] args) {
         boolean a=true;
         int b=13;
         double c=250;

         indirimliFiyatHesapla(a,b,c);
    }

    public static void indirimliFiyatHesapla(boolean üyemi,int üyelikyılı,double satışfiyatı){

        if(üyemi){
            if(üyelikyılı<5){
                System.out.println("ürün fiyat : " + satışfiyatı);
                System.out.println("indirim miktarı : " + satışfiyatı*0.1);
                System.out.println(" indirimli fiyat : "+(satışfiyatı-satışfiyatı*0.1));

            }
            else {
                System.out.println("ürün fiyat : " + satışfiyatı);
                System.out.println("indirim miktarı : " + satışfiyatı*0.15);
                System.out.println(" indirimli fiyat : "+(satışfiyatı-satışfiyatı*0.15));

            }

        }
        else{
            System.out.println("ürün fiyat : " + satışfiyatı);
            System.out.println("indirim miktarı : " + satışfiyatı*0.05);
            System.out.println(" indirimli fiyat : "+(satışfiyatı-satışfiyatı*0.05));
        }

    }
}
