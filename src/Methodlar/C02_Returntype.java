package Methodlar;

public class C02_Returntype {
    public static void main(String[] args) {
        C01_methodlar.indirimliFiyatHesapla(true,12,100);

        String isim="semra";
        String soyisim="koca";
        String isimsoyisim=isimdüzenle(isim,soyisim);

        System.out.println("ilk girilen :  "+isim+" "+soyisim);

        System.out.println("duzenlenmıs hali : "+ isimsoyisim);
    }

    private static String isimdüzenle(String isim, String soyisim) {
        String isimdüzenlenmiş=isim.substring(0,1).toUpperCase()+

                isim.substring(1).toLowerCase();

        String soyisimdüzenlenmiş= soyisim.substring(0,1).toUpperCase()+

                soyisim.substring(1).toLowerCase();


        return isimdüzenlenmiş+" "+soyisimdüzenlenmiş;


    }
}
